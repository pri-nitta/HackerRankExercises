import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var c: Array <Int> = (arrayOf(0,0))
    for (i in 0..2){
        if (a[i]>b[i]){
            c[0]=c[0]+1
        } else if (a[i]<b[i]){
                c[1]=c[1]+1
            } else{
                (c[0] ==0 && c[1] ==0)
            }
        }
    return c
    }

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}