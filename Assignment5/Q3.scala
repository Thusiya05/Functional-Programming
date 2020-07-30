package First

class Account(id:String,n:Int,b:Double){
    val nic:String = id
    val acnumber:Int = n
    var balance:Double = b

    def withdraw(a:Double)= this.balance = this.balance - a

    def deposit(a:Double) = this.balance = this.balance + a

    def transfer(a:Account, b:Double){
        a.balance += b;
        this.balance -=b;
    }

    override def toString = "[ "+nic+" : "+acnumber+" : "+balance+" ]";
}

object Q3 {
        def main(args:Array[String])
        {
          var x = new Account("971425369v",2010,25000);
          var y = new Account("975869753v",2015,30000);
          println(x)
          println(y)

          x.withdraw(2000);
          println("After withdrawing : ")
          println(x)
          x.deposit(5000);
          println("After depositing : ")
          println(x)
          x.transfer(y,3000);
          println("After transfering : ")
          println(x)
          println(y)
        }
  
}