object Q1 extends App {
  val x=new Rational(3,6)
  println(x);
  println(x.neg)
}

class Rational(x: Int, y: Int){
  require(y>0,"Denominator must be greater than zero!")
  private def gcd(a: Int, b: Int): Int=if (b==0) a else gcd(b,a%b)
  private val g=gcd(Math.abs(x),y)
  def numer=x/g
  def denom=y/g
  def neg=new Rational(-this.numer,this.denom)
  override def toString: String = numer + "/" + denom
}
