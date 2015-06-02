/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author magor
 */
public class Table extends JFrame {


  public Table(String title, int width, int height) throws HeadlessException {
    super(title);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(width, height);
    setVisible(true);
  }
}
