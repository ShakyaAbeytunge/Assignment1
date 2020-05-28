import scala.io.StdIn.readInt

object program3 extends App {
  def sum(n: Int): Int=n match {
    case 1 => 1
    case _=> n+sum(n-1)
  }

  print("Enter a number : ")
  val n=readInt()
  printf("sum(%d) = %d",n,sum(n))

}
