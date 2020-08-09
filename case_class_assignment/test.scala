package case_class_assignment

object test extends App{
        
          val pt1 = Point(3,4)
          val pt2 = Point(4,7)
          val pt3 = pt1 + pt2
          val pt4 = pt1.move(4,6)
          val pt5 = pt2.invert()
          val dis = pt1.distance(6,5)

   
          println(pt1)
          println(pt2)
          print("Question 1 : Add two points")
          println(" "+pt3)
          print("Question 2 : move a point")
          println(" "+pt4)
          print("Question 3 : Get the reverse cordinates")
          println(" "+pt5)
          print("Question 4 : Get the distance of two points ")
          println(dis)
          
}
        
   case class Point(p:Int,q:Int){
    def x:Int = p;
    def y:Int = q;
    
    def +(that:Point) = Point(this.x+that.x,this.y + that.y)
   
    def move(dx:Int,dy:Int) = Point(this.x + dx,this.y+dy)
    
    def distance(dx:Int,dy:Int): Double = scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))
    
    def invert() = Point(this.y,this.x)
}
        
