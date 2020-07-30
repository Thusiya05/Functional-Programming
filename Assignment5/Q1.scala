package First

class Rational(a: Int, b: Int) {
  def numer = a
  def denom = b
  def neg=new Rational(-this.numer,this.denom)
  override def toString = numer + "/" + denom
};

object Q1 {
        def main(args:Array[String])
  {
        println("Enter a numerator: ")
        var numerator=scala.io.StdIn.readInt()
        println("Enter a denominator: ")
        var denominator=scala.io.StdIn.readInt()
        var obj =new Rational(numerator,denominator);
        println(obj.neg)
  }
  
}