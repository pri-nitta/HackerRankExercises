import kotlin.collections.*
import kotlin.io.*
import kotlin.math.absoluteValue
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>, n: Int): Int {
    var sum1: Int = 0
    var sum2: Int = 0
    var j: Int = 0
    var k: Int = n-1
    for (i in 0 until n) {
        sum1 += arr[i][j]
        j += 1
    }
    println(sum1)
    for (i in 0 until n) {
        sum2 += arr[i][k]
        k -= 1
    }
    println(sum2)
    var totalDif : Int = sum1 - sum2
    return totalDif.absoluteValue
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr, n)

    println(result)
}