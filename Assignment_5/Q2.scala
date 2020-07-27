object Q2 extends App {
  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  println(x-y-z)
}
class Rational(x: Int, y: Int){
  require(y>0,"Denominator must be greater than zero!")
  private def gcd(a: Int, b: Int): Int=if (b==0) a else gcd(b,a%b)
  private val g=gcd(Math.abs(x),y)
  def numer=x/g
  def denom=y/g
  def neg=new Rational(-this.numer,this.denom)
  def +(that: Rational)= new Rational(this.numer*that.denom+that.numer*this.denom,this.denom*that.denom)
  def -(that: Rational)= this+that.neg
  override def toString: String = numer + "/" + denom
}