def GCD(a:Int,b:Int):Int=b match{
case 0 => a
case x if x>a => GCD(b,a)
case _ => GCD(b,a%b)
}

def isPrime(p: Int, n: Int=2): Boolean = n match{
    case x if (x == p) => true;
    case x if GCD(p, x) > 1 => false;
    case x => isPrime(p, x+1)
}

def primeSeq(n: Int, s: Int = 2): Unit = {
    if (s < n){
        if(isPrime(s)) println(s);
        primeSeq(n, s+1);
    }
}

@main def main() = {
    print("Enter a number: ");
    val data = scala.io.StdIn.readInt();
    primeSeq(data)
}