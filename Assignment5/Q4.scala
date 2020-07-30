package second

object Q4 {
  def main(args:Array[String])
  {
      var x1 = new Account("971421630v",10000,25000);
      var x2 = new Account("971254963v",10001,15000);
      var x3 = new Account("982459687v",10002,7500);
      var x4 = new Account("993247896v",10003,7575);
      var x5 = new Account("968765239v",10004,-2500);

      var bank:List[Account] = List(x1,x2,x3,x4,x5);
      println("Bank Accounts : ");
      println(bank);

      val overdraft = (b:List[Account]) => b.filter(x=> x.balance < 0);
      println("Overdraft accounts : ");
      println(overdraft(bank))
 
      val balance = (a:List[Account])=> a.reduce((x,y)=> (new Account(x.nic,x.acnumber,x.balance+y.balance)))
      println("Sum of account balances : ");
      println(balance(bank).balance)
    
      val interest = (acc: List[Account])=> acc.map(x=> {
      if(x.balance<0)  (new Account(x.nic,x.acnumber,x.balance*1.05)) else (new Account(x.nic,x.acnumber,x.balance*1.1))})
      println("Accounts after interest : ");
      println(interest(bank))
  }
}
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