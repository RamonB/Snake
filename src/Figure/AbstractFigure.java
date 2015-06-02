package Figure;

import java.awt.Point;

/**
 *
 * @author ramon
 */
abstract class AbstractFigure {

  public AbstractFigure(Point position) {
    this.position = position;
  }
 
  /*
  * Current postion of a figure
  */
  private Point position;
  
  /*
  * function to move the figure vertical
  */
  public void moveX(int step){
    this.position.x += step;
  }
  
  
  /*
  * function tho move the figure horizontal
  */
  public void moveY(int step){
    this.position.y += step;
  }
  
}
