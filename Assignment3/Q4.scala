package Assignment3

 import scala.io.StdIn

object Q4 {
        def main(args: Array[String]) {
     
   print("Enter the number : ") 
   var y=readInt()
   var i=addeven(y-1)
   println("Addition of even numbers = "+ i)
   }
   
   def addeven(n:Int):Int=
   {
     if (n <= 1)
          return 0;
      else
      {
          if(n%2 == 1)
              return addeven(n - 1);
          else 
              return n + addeven(n - 1);
      }
     
   }
}