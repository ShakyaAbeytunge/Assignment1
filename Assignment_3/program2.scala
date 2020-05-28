import scala.io.StdIn.readInt

object program2 extends App {
  def GCD(a: Int, b: Int): Int=b match {
    case 0 => a
    case x if (x>a) => GCD(x,a)
    case x => GCD(x,a%x)
  }

  def prime(n: Int, i: Int=2): Boolean=i match{
    case x if (x==n) =>true
    case x if (GCD(n,x)>1) => false
    case x => prime(n,x+1)
  }

  def primeSeq(n: Int): Any= {
    if (n>2) primeSeq(n-1)
    if (prime(n)==true) println(n)
  }

  print("Enter a number : ")
  val n=readInt()
  printf("The prime sequence under %d;\n",n)
  primeSeq(n)

}
