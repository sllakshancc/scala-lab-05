def fib(n: Int, a: Int = 0, b: Int = 1): Unit = {
    if (n > 0) {
      println(a)
      fib(n - 1, b, a + b)
    }
}

@main def main() = {
  print("Enter a number: ")
  val data = scala.io.StdIn.readInt()
  fib(data)
}