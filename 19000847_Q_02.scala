object Q_02 {

  def main(args: Array[String])={
        primeseq(20);
  }
  def isprime(n:Int,i:Int=2): Boolean ={

    if(n <= 2) return if (n==2) true else false;
    if(n % i == 0) return false;
    if(i*i >n) return true;

    isprime(n,i+1);
  }

  def primeseq(p:Int):Unit={
    if(p>0){
      primeseq(p-1)
    }
    if (isprime(p)) println(p);
  }



}
