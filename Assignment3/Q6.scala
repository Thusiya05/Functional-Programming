package Assignment3

import scala.io.StdIn

object Q6 {
        def main(args: Array[String]) {
   print("Enter the number : ") 
   var y=readInt() 
      for (i <- 1 to y)
         println( "Addition of " + i + ": = " + Addition(i) )
   }
   
   def Addition(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n + Addition(n - 1)
   }
}