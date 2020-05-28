import scala.io.StdIn.readInt

object program1 extends App {
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

  print("Enter a number to check : ")
  val n=readInt()
  printf("prime(%d) = %b", n, prime(n))

}
