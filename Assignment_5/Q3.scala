object Q3 extends App {
  val acc1=new Account("123",1000)
  val acc2=new Account("124",100)
  println(acc1)
  println(acc2)
  acc1.transfer(acc2,500)
  println("Money transferred successfully!")
  println(acc1)
  println(acc2)

}

class Account(a: String, b: Double){
  val accNo=a
  var balance=b
  def transfer(to: Account, amo: Double)={
    this.balance=this.balance-amo;
    to.balance=to.balance+amo;
  }
  override def toString: String = "AccNo: "+this.accNo + "\n" + "Balance: "+ this.balance
}