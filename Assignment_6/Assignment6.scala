import math.pow
import math.sqrt
object Assignment6 extends App {
  val p1= Point(2,3)
  val p2=Point(1,4)
  println("p1: "+p1+"\n"+"p2: "+p2)
  println("p1+p2: "+(p1+p2))
  println("Move p1 by 1 unit: "+p1.move(1,1))
  println("Distance between p1 and p2: "+p1.distance(p2))
  println("Inverse of p1: "+p1.invert())
}

case class Point(x:Int, y:Int){
  def +(that: Point)=Point(this.x+that.x,this.y+that.y)
  def move(dx: Int, dy: Int)=Point(this.x+dx,this.y+dy)
  def distance(that: Point): Double = sqrt(pow(this.x-that.x,2)+pow(this.y-that.y,2))
  def invert()=Point(this.y,this.x)
}
