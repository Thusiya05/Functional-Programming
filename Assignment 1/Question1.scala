package First

object Question1 {
  
       def main(args:Array[String])
        {
         
          //Convert 35C to fahrenheit
          var x=convert_cel_to_fahren(35F)
          println("35C = "+(x*10000).round/10000.toDouble+"F\n")
     
        }
       
        def convert_cel_to_fahren(cel_value:Float):Double=
        {
          
          var fahren_value = (cel_value*1.8000)+32.00
          return fahren_value
          
        }
        
}