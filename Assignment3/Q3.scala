package Assignment3

   import scala.io.StdIn

object Q3 {
        def main(args: Array[String]) {
   
   print("Enter the number : ") 
   var y=readInt() 
   
    oddeven(y)
   }
   
  def oddeven(n:Int):Int={
    
    if(n==0)
      return 0
    else
    {
      if(n%2==1)
      {
        println(n + " is an odd number")
        return oddeven(n-1)
      }
      else
      {
        println(n + " is an even number")
         return oddeven(n-1)
      }
    }
  }
}