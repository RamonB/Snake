package Figure;

import java.awt.Point;

/**
 *
 * @author ramon
 */
abstract class AbstractFigure {
  /**
   * Current position of a figure
   */
  private Point position;
  
  /**
   * Moves the figure horizonal
   * 
   * @param step Step to move
   */
  public void moveX(int step) {
    this.position.x += step;
  }
  
  /**
   * Moves the figure vertical
   * 
   * @param step Step to move
   */
  public void moveY(int step) {
    this.position.y += step;
  }
  
}
