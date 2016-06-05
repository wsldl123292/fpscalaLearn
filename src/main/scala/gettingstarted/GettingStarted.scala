package gettingstarted

/**
  * 说明
  * 作者 LDL 
  * 时间 2016/6/5.
  */
object GettingStarted {
    //斐波那契数
    def fib(n: Int): Int = {
        @annotation.tailrec
        def loop(n: Int, prev: Int, cur: Int): Int =
            if (n == 0) prev
            else loop(n - 1, cur, prev + cur)
        loop(n, 0, 1)
    }

    def main(args: Array[String]) {
        println(fib(1))
    }
}
