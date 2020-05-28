import scala.io.StdIn.readInt

object program4 extends App {
  def isEven(n: Int): Boolean=n match {
    case 0 => true
    case _=> isOdd(n-1)
  }

  def isOdd(n: Int):Boolean={
    if (isEven(n)) false else true
  }

  def printResult(n: Int): Any=isEven(n) match {
    case true => println("An even number!")
    case _ => println("An odd number!")
  }

  print("Enter a number to check : ")
  val n=readInt()
  printResult(n)

}
