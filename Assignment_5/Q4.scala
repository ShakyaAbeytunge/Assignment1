object Q4 extends App {

  val acc1=new Account("1000", 2000)
  val acc2=new Account("1001", -500)
  val acc3=new Account("1002", 1200)
  val acc4=new Account("1003", 0)
  var bank: List[Account]=List(acc1,acc2,acc3,acc4)

  val overdraft=(b: List[Account])=>b.filter(x=>x.balance<0)
  val balance=(b: List[Account])=>b.reduce(_+_)

  println("Accounts with negative balances: " + overdraft(bank))
  println("Sum of all accounts: " + balance(bank))


  val calInterest=(b: List[Account])=>b.map(x=>if(x.balance>0) x.balance+x.balance*0.05 else x.balance+x.balance*0.1)

  println("Account balances after adding the interest: " + calInterest(bank))

}

class Account(a: String, b: Double){
  val accNo=a
  var balance=b

  def +(a: Account)=new Account("",balance+a.balance)
  override def toString: String = "[" +this.accNo + "," + this.balance + "]"
}