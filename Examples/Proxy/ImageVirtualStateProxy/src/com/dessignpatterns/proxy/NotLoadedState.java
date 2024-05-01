package com.dessignpatterns.proxy;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class NotLoadedState implements ImageState {

  ImageIcon imageIcon;
  Thread retrievalThread;
  boolean retrieving = false;
  ImageProxy imageProxy;

  public NotLoadedState(ImageProxy imageProxy) {
    this.imageProxy = imageProxy;
  }

  @Override
  public int getIconWidth() {
    return 800;
  }

  @Override
  public int getIconHeight() {
    return 600;
  }

  synchronized void setImageIcon(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    g.drawString("Loading album cover, please wait...", x + 300, y + 190);
    if (!retrieving) {
      retrieving = true;

      retrievalThread = new Thread(() -> {
        try {
          setImageIcon(new ImageIcon(imageProxy.getImageURL(), "Album Cover"));
          imageProxy.setState(new LoadedState(imageIcon));
          c.repaint();
        } catch (Exception e) {
          e.printStackTrace();
        }
      });

      retrievalThread.start();
    }
  }
}
