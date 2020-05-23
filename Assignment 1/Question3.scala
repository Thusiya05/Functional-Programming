package First

object Question3 {
  
      def main(args:Array[String])
        {
        
          //find the wholesale cost for 60 copies
          var z = cost(60)
          println("wholesale cost for 60 copies = "+(z*100).round/100.toDouble+"\n")
    
        }
      
       def cost(n:Int):Double=
        {
         
         //n= no of copies and n >=50
          var cost_of_books=n*24.95*0.6
          var cost_for_shiping=3*50+(n-50)*0.75
          var wholesale_cost=cost_of_books+cost_for_shiping
          return wholesale_cost
          
        }
       
}