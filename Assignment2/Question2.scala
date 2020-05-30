package Assignment2

object Question2 {
        def main(args:Array[String])
        {
          //Max profit gives the best price
          println("If ticket price 5 then profit = "+profit(5))
          println("If ticket price 10 then profit = "+profit(10))
          println("If ticket price 15 then profit = "+profit(15))
          println("If ticket price 20 then profit = "+profit(20))
        }
        
        def attendees(price: Int):Int=
        {
          return 120 + ((15-price)/5)*20
        }
        
        def revenue(price: Int):Int=
        {
          return attendees(price)*price
        }
        
        def cost(price: Int):Int=
        {
          return 500+(3*attendees(price))
        }
        
        def profit(price: Int):Int=
        {
          return revenue(price)-cost(price)
        }
}