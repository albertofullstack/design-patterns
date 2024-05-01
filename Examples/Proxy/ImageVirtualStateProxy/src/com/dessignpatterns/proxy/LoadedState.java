package com.dessignpatterns.proxy;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class LoadedState implements ImageState {

  ImageIcon imageIcon;

  public LoadedState(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
  }

  @Override
  public int getIconWidth() {
    return imageIcon.getIconWidth();
  }

  @Override
  public int getIconHeight() {
    return imageIcon.getIconHeight();
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    imageIcon.paintIcon(c, g, x, y);
  }
}
