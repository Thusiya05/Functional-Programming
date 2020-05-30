package Assignment3

    import scala.io.StdIn

object Q5 {
   def main(args: Array[String]) {
     
   print("Enter the number : ") 
   var y=readInt()
   
   println("Fibonacci series\n ")
   var n1:Int=0
   var n2:Int=1
  
   while(n2<=y)
   {
     println(Fib(n1))
        n1+=1
        n2+=1
   }
    }
    
 def Fib(n:Int):Int=
 {
    if ( n == 0 )
      return 0;
   else if ( n == 1 )
      return 1;
   else
      return ( Fib(n-1) + Fib(n-2) );
 }
}