package Assignment2

object Question1 {
        def main(args:Array[String])
         {
          //finding the take home salary
          println("Take home salary = "+take_home_salary(40,20))
         }
        def salary_for_normal_hours(normal_hours: Int): Int=
         {
          return normal_hours*150       
         }
        
        def salary_for_OT_hours(OT_hours: Int): Int=
        {
          return OT_hours*75
        }
        
        def income(normal_hours: Int,OT_hours: Int): Int=
        { 
          return salary_for_normal_hours(normal_hours)+salary_for_OT_hours(OT_hours) 
        }
        
        def tax(income: Int): Double=
        {
          return income*0.1
        }
        
        def take_home_salary(normal_hours: Int,OT_hours: Int): Double=
        {
          return income(normal_hours,OT_hours)-tax(income(normal_hours,OT_hours))
        }
        
}