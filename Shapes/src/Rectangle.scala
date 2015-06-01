/**
 * Created by mahesh on 01/06/15.
 */
class Rectangle(l :Int, b :Int) extends Shape{
  var length :Int = l
  var breadth :Int = b

  override def calculateArea(): Double = {
      length * breadth
  }

  override def calculatePerimeter(): Double = {
    2 * (length + breadth)
  }

  override
  def toString(): String = {
    "Rectangle(Length: "+length+" ,Breadth: "+breadth+")"
  }
}
