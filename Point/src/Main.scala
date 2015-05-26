/**
 * Created by mahesh on 26/05/15.
 */
object Main {
  def main (args: Array[String]) {
    val pt1 = new Point(2,2);
    println(pt1);
    pt1.move(3,2);
    println("After Moved",pt1);
  }
}
