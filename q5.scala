def evenAdd(n: Int): Int = n match {
    case x if x <= 0 => 0;
    case x if x % 2 == 0 => x + evenAdd(x-1);
    case _ => evenAdd(n-1);
}

@main def main() = {
    print("Input a number: ");
    val n = scala.io.StdIn.readInt();
    println("Total of even numbers: "+ evenAdd(n-1));
}