package second

class Rational(p:Int, q:Int){
    private def gcd(x:Int, y:Int): Int = if(y == 0) x else gcd(y, x%y)
    private val g = gcd(p, q)
    def numer = p/g
    def denom = q/g
    def +(r: Rational) = new Rational(this.numer*r.denom + r.numer*this.denom, denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    def -(r: Rational) = this + r.neg
    override def toString = numer + "/" + denom;
} 

object Q2 {
        def main(args:Array[String])
  {
        val a = new Rational(3, 4)
        val b = new Rational(5, 8)
        val c = new Rational(2, 7)
        println(a + " - " + b + " - " + c + " = " + (a-b-c))
  }

  
}