package Assignment3

import scala.io.StdIn

object Q2 {
        def main(args: Array[String]) {
   
     
   print("Enter the number : ") 
   var y=readInt() 
   println("prime numbers until "+y+": ")
   
   for(i<-1 until y)
   {
     if(prime(i))
      println(i)
     
   }
   
}
  def prime(n:Int,i:Int=2):Boolean=
  {
    if(n==1)
      return false
    if(n==2)
      return true
    if(n%i==0)
      return false;
    if(i*i>n)
      return true;
    
    return prime(n,i+1);
    
  }
}