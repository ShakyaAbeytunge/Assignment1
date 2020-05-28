import scala.io.StdIn.readInt

object program5 extends App {
  def isEven(n: Int): Boolean=n match {
    case 0 => true
    case _=> isOdd(n-1)
  }

  def isOdd(n: Int):Boolean={
    if (isEven(n)) false else true
  }

  def printEven(n: Int): Any={
    if(n>0) printEven(n-1)
    if(isEven(n)) println(n)
  }

  print("Enter a number : ")
  val n=readInt()
  printf("The even number series less than %d;\n",n)
  printEven(n)

}
