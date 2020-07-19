package caesar_cipher_assignment

object cipher {
        def main(args:Array[String])
                  {
	                    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	
	                    val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	                    val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
	                    val ciepher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
	                    
	                    var s=scala.io.StdIn.readLine("Message that want to encrypt : ")
	                    
	                    print("Enter the shift number : ")
	                    var x= scala.io.StdIn.readInt()
	                    
	                    val Encrypt=ciepher(E,s,x,alphabet)
	                    val Decrypt=ciepher(D,Encrypt,x,alphabet)
	                    println(Encrypt)
	                    println(Decrypt)
                  }
              }