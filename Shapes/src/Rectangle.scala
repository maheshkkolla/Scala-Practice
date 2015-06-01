/**
 * Created by mahesh on 01/06/15.
 */
class Rectangle(l :Int, b :Int) {
  var length :Int = l
  var breadth :Int = b

  def calculateArea(): Int = {
      length * breadth
  }

  def calculatePerimeter(): Int = {
    2 * (length + breadth)
  }

  override
  def toString(): String = {
    "Rectangle(Length: "+length+" ,Breadth: "+breadth+")"
  }
}
