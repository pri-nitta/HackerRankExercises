import java.util.*
import kotlin.text.*

// Complete the staircase function below.
fun staircase2(n: Int) {
    (1..n).forEach{
        println(" ".repeat(n-it)+"#".repeat(it))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    staircase2(n)
}
