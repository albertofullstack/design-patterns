package com.dessignpatterns.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class ImageProxyTestDrive {

  ImageComponent imageComponent;
  JFrame frame = new JFrame("Album Cover Viewer");
  JMenuBar menuBar;
  JMenu menu;
  Hashtable<String, String> albums = new Hashtable<>();

  public static void main(String[] args) throws Exception {
    new ImageProxyTestDrive();
  }

  public ImageProxyTestDrive() throws Exception {
    albums.put("Buddha Bar",
        "https://m.media-amazon.com/images/I/61qJowdT8TL._SY300_SX300_QL70_ML2_.jpg");
    albums.put("Ima", "https://m.media-amazon.com/images/I/610ISz+nFOL._AC_UL320_.jpg");
    albums.put("Karma", "https://m.media-amazon.com/images/I/71FBUmGAuIL._AC_UL320_.jpg");
    albums.put("MCMXC a.D.", "https://m.media-amazon.com/images/I/71woEuHgmdL._AC_UL320_.jpg");
    albums.put("Northern Exposure",
        "https://m.media-amazon.com/images/I/91WYTQVhsYL._AC_UL320_.jpg");
    albums.put("Selected Ambient Works, Vol. 2",
        "https://m.media-amazon.com/images/I/71j8jU3WBML._AC_UL320_.jpg");

    URL initialURL = new URL(albums.get("Selected Ambient Works, Vol. 2"));
    menuBar = new JMenuBar();
    menu = new JMenu("Favorite Albums");
    menuBar.add(menu);
    frame.setJMenuBar(menuBar);

    for (Enumeration<String> e = albums.keys(); e.hasMoreElements(); ) {
      String name = e.nextElement();
      JMenuItem menuItem = new JMenuItem(name);
      menu.add(menuItem);
      menuItem.addActionListener(event -> {
        imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
        frame.repaint();
      });
    }

    // set up frame and menus

    Icon icon = new ImageProxy(initialURL);
    imageComponent = new ImageComponent(icon);
    frame.getContentPane().add(imageComponent);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setVisible(true);
  }

  URL getAlbumUrl(String name) {
    try {
      return new URL(albums.get(name));
    } catch (MalformedURLException e) {
      e.printStackTrace();
      return null;
    }
  }
}