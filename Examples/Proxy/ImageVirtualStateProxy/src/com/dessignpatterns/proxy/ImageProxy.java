package com.dessignpatterns.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

  volatile ImageIcon imageIcon;
  final URL imageURL;
  ImageState imageState;

  public ImageProxy(URL url) {
    imageState = new NotLoadedState(this);
    imageURL = url;
  }

  public int getIconWidth() {
    return imageState.getIconWidth();
  }

  public int getIconHeight() {
    return imageState.getIconHeight();
  }

  public void paintIcon(final Component c, Graphics g, int x, int y) {
    imageState.paintIcon(c, g, x, y);
  }

  public void setState(ImageState state) {
    this.imageState = state;
  }

  public ImageIcon getImageIcon() {
    return imageIcon;
  }

  public URL getImageURL() {
    return imageURL;
  }
}
