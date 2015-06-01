/**
 * Created by mahesh on 01/06/15.
 */
class Square(s :Int) {
  var side :Int = s
  override def toString(): String = "Square(Side: "+side+")"

  def calculateArea(): Int = {
    4 * side;
  }
}
