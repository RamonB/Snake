package Board;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author ramon
 */
public class Table extends JFrame {

  public Table(String title, int width, int height) throws HeadlessException {
    super(title);
    
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(width, height);

    setResizable(false);
    setVisible(true);
  }

}
