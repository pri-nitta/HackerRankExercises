import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>) {
    var max: Long = 0
    var min: Long = arr[0].toLong()
    var total: Long = 0
    for (i in 0..arr.size - 1) {
        val item = arr[i].toLong()
        total += item
        if (item <min){
            min = item
        }
        if (item > max){
            max = item
        }
    }
    print("${total-max} ${total-min}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}