import scala.io.StdIn.readInt

object program2 extends App {
  def attendees(ticketPrice: Int)=120+(15-ticketPrice)/5*20
  def revenue(ticketPrice: Int)=attendees(ticketPrice)*ticketPrice
  def cost(ticketPrice: Int)=500+attendees(ticketPrice)*3
  def profit(ticketPrice: Int)=revenue(ticketPrice)-cost(ticketPrice)

  print("Enter ticket price : ")
  val price=readInt()
  printf("The profit you get : %d.00\n", profit(price))

}
