package First

object Assignment {
        def main(args:Array[String])
        {
          //Convert 35C to fahrenheit
          var x=convert_cel_to_fahren(35F)
          println("35C = "+(x*10000).round/10000.toDouble+"F\n")
     
          
          //Find the volume
          var  y= volume(5)
          println("volume of a sphere with radius 5 = "+(y*10000).round/10000.toDouble+"\n")
          
          
          //find the wholesale cost for 60 copies
          var z = cost(60)
          println("wholesale cost for 60 copies = "+(z*100).round/100.toDouble+"\n")
    
        }
        
        def convert_cel_to_fahren(cel_value:Float):Double=
        {
          var fahren_value = (cel_value*1.8000)+32.00
          return fahren_value
        }
        
        def volume(radius:Int):Double=
        {
          val pi = math.Pi
          var volume=(4F/3)*pi*scala.math.pow(radius,3)
          return volume
        }
        
        def cost(n:Int):Double=
        {
         //n= no of copies and n >=50
          var cost_of_books=n*24.95*0.6
          var cost_for_shiping=3+(n-50)*0.75
          var wholesale_cost=cost_of_books+cost_for_shiping
          return wholesale_cost
        }
}