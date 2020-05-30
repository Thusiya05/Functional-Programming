package Assignment3

import scala.io.StdIn

object Q1 {
         def main(args: Array[String]) {
 
 
   print("Enter the number : ") 
   var y=readInt() 
   if(prime(y))
     println(y +" is a Prime number")
   else
      println(y +" is not a Prime number")
  
  
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