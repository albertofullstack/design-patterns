package com.designpatterns.mvc;

import java.util.ArrayList;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class BeatModel implements BeatModelInterface, MetaEventListener {

  Sequencer sequencer;
  ArrayList beatObservers = new ArrayList();
  ArrayList bpmObservers = new ArrayList();
  int bpm = 90;
  Sequence sequence;
  Track track;

  public void initialize() {
    setUpMidi();
    buildTrackAndStart();
  }

  public void on() {
    sequencer.start();
    setBPM(90);
  }

  public void off() {
    sequencer.stop();
  }

  public void setBPM(int bpm) {
    this.bpm = bpm;
    sequencer.setTempoInBPM(getBPM());
    notifyBPMObservers();
    beatEvent();
  }

  public int getBPM() {
    return bpm;
  }

  void beatEvent() {
    notifyBeatObservers();
  }


  public void registerObserver(BeatObserver o) {
    beatObservers.add(o);
  }

  public void notifyBeatObservers() {
    for (Object beatObserver : beatObservers) {
      BeatObserver observer = (BeatObserver) beatObserver;
      observer.updateBeat();
    }
  }

  public void registerObserver(BPMObserver o) {
    bpmObservers.add(o);
  }

  public void notifyBPMObservers() {
    for (Object bpmObserver : bpmObservers) {
      BPMObserver observer = (BPMObserver) bpmObserver;
      observer.updateBPM();
    }
  }


  public void removeObserver(BeatObserver o) {
    int i = beatObservers.indexOf(o);
    if (i >= 0) {
      beatObservers.remove(i);
    }
  }



  public void removeObserver(BPMObserver o) {
    int i = bpmObservers.indexOf(o);
    if (i >= 0) {
      bpmObservers.remove(i);
    }
  }

  public void meta(MetaMessage message) {}

  public void setUpMidi() {
    try {
      sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.addMetaEventListener(this);
      sequence = new Sequence(Sequence.PPQ,4);
      track = sequence.createTrack();
      sequencer.setTempoInBPM(getBPM());
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public void buildTrackAndStart() {
    int[] trackList = {35, 0, 46, 0};

    sequence.deleteTrack(null);
    track = sequence.createTrack();

    makeTracks(trackList);
    track.add(makeEvent(192,9,1,0,4));
    try {
      sequencer.setSequence(sequence);
      sequencer.setLoopCount(Integer.MAX_VALUE); // play forever
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public void makeTracks(int[] list) {

    for (int i = 0; i < list.length; i++) {
      int key = list[i];

      if (key != 0) {
        track.add(makeEvent(144,9,key, 100, i));
        track.add(makeEvent(128,9,key, 100, i+1));
      }
    }
  }

  public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
    MidiEvent event = null;
    try {
      ShortMessage a = new ShortMessage();
      a.setMessage(comd, chan, one, two);
      event = new MidiEvent(a, tick);

    } catch(Exception e) {
      e.printStackTrace();
    }
    return event;
  }
}
