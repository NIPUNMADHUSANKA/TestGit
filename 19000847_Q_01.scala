object Q_01 {

  def main(args: Array[String])={
      println(isprime(5))
      println(isprime(8))
  }

def isprime(n:Int,i:Int=2): Boolean ={

  if(n <= 2) return if (n==2) true else false;
  if(n % i == 0) return false;
  if(i*i >n) return true;

   isprime(n,i+1);
}


}
