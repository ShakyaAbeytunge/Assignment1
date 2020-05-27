import scala.io.StdIn.readInt

object program1 extends App {
  def normalPay(h: Int)=h*150
  def otPay(h:Int)=h*75
  def totalPay(h1: Int, h2: Int)=normalPay(h1)+otPay(h2)
  def tax(h1: Int, h2: Int): Double=totalPay(h1,h2)*0.1
  def takeHomeSalary(h1: Int, h2: Int): Double=totalPay(h1,h2)-tax(h1,h2)

  println("Enter normal working hours :")
  val h1=readInt()
  println("Enter OT working hours :")
  val h2=readInt()
  printf("Take Home Salary : %.2f\n", takeHomeSalary(h1,h2))

}
