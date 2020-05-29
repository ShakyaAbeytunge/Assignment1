import scala.io.StdIn.readInt

object program5 extends App {
  def isEven(n: Int): Boolean=n match {
    case 0 => true
    case _=> isOdd(n-1)
  }

  def isOdd(n: Int):Boolean={
    if (isEven(n)) false else true
  }

  def sumEven(n: Int): Int={
    if (n==2) 2 else if (isOdd(n)) sumEven(n-1) else n+sumEven(n-2)
  }

  print("Enter a number : ")
  val n=readInt()
  printf("Sum of the even number series less than %d;\n",n)
  println(sumEven(n-1))

}
