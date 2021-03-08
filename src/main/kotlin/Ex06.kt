import java.util.*
import kotlin.text.*

// Complete the staircase function below.

tailrec fun strGen(ch: Char, accum: String, n: Int): String {
    if (n == 0) return accum
    else return strGen(ch, accum + ch, n - 1)}

fun staircase(n: Int) {
    for (i in 0 until n) {
        println(strGen(' ', "", n - i) + strGen('#', "", i + 1))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    staircase(n)
}
