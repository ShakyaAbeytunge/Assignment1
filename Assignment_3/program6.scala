import scala.io.StdIn.readInt

object program6 extends App {
  def fib(n: Int): Int=n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1)+fib(n-2)
  }
  def printFib(n: Int): Any={
    if(n>0) printFib(n-1)
    println(fib(n))
  }

  print("Enter a number : ")
  val n=readInt()
  printf("F0 to F%d of Fibonacci series;\n",n)
  printFib(n)

}
