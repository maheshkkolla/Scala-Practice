/**
 * Created by mahesh on 26/05/15.
 */
class Point(xc : Int, yc :Int) {
  var x :Int = xc;
  var y :Int = yc;

  def move(toX : Int, toY : Int) {
    x += toX;
    y += toY;
  }

  override def toString(): String = "Point: ("+x+","+y+")";
}
