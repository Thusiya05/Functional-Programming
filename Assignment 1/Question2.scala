package First

object Question2 {
  
      def main(args:Array[String])
        {
        
          //Find the volume
          var  y= volume(5)
          println("volume of a sphere with radius 5 = "+(y*100).round/100.toDouble+"\n")
          
        }
      
      def volume(radius:Int):Double=
        {
        
          val pi = math.Pi
          var volume=(4F/3)*pi*scala.math.pow(radius,3)
          return volume
          
        }
      
}