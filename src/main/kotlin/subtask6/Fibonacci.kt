package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var fib1 = 0
        var fib2 = 1
        var temp: Int
        var isProduct = 0
        while (fib1 * fib2 < n) {
            temp = fib1 + fib2
            fib1 = fib2
            fib2 = temp
            if (fib1 * fib2 == n) {
                isProduct = 1
                break
            }
        }
        return intArrayOf(fib1, fib2, isProduct)
    }
}
