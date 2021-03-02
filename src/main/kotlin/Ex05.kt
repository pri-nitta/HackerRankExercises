import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>,n:Int): Unit {
    var max: Double = 0.0
    var min: Double = 0.0
    var zero: Double = 0.0
for (i in 0 until n){
    when {
        arr[i]>0 -> {
            max +=1
        }
        arr[i]<0 -> {
            min +=1
        }
        else -> {
            zero +=1
        }
    }
}
    val a1 =  "%.6f".format(max/n)
    val a2 =  "%.6f".format(min/n)
    val a3 =  "%.6f".format(zero/n)

return println("$a1 \n$a2 \n$a3")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr,n)
}
