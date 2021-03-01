import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: Array<Long>, arCount: Int): Long {
    var totalSum : Long = 0
for (i in 0 until arCount){
   totalSum += ar[i]
}
return totalSum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar,arCount)

    println(result)
}
