
/**
 * Created by mahesh on 01/06/15.
 */
object Shapes {
  def main (args: Array[String]) {
    val r1 = new Rectangle(5, 5);
    println(r1.toString() +"\tArea: "+r1.calculateArea() +", Perimeter: "+r1.calculatePerimeter())
    val s1 = new Square(2);
    println(s1 +"\tArea: "+s1.calculateArea());
  }
}
