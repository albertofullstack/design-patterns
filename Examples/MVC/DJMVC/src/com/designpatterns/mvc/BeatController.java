package com.designpatterns.mvc;

public class BeatController implements ControllerInterface {

  BeatModelInterface model;
  DJView view;

  public BeatController(BeatModelInterface model) {
    this.model = model;
    view = new DJView(this, model);
    view.createView();
    view.createControls();
    view.disableStopMenuItem();
    view.enableStartMenuItem();
    model.initialize();
  }

  @Override
  public void start() {
    model.on();
    view.disableStartMenuItem();
    view.enableStopMenuItem();
    view.updateBPM();
  }

  @Override
  public void stop() {
    model.off();
    view.disableStopMenuItem();
    view.enableStartMenuItem();
    view.updateBPM();
  }

  @Override
  public void increaseBPM() {
    int bpm = model.getBPM();
    model.setBPM(bpm + 1);
    view.updateBPM();
  }

  @Override
  public void decreaseBPM() {
    int bpm = model.getBPM();
    model.setBPM(bpm - 1);
    view.updateBPM();
  }

  @Override
  public void setBPM(int bpm) {
    model.setBPM(bpm);
    view.updateBPM();
  }
}
