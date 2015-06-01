/**
 * Created by mahesh on 01/06/15.
 */
class Square(s :Int) extends Shape{
  var side :Int = s
  override def toString(): String = "Square(Side: "+side+")"

  override def calculateArea(): Double = {
    side * side;
  }

  override def calculatePerimeter(): Double ={
    4 * side;
  }
}
