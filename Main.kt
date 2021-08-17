fun main(args: Array<String>) {
    //Златопольский, 1400 задач по программированию, задача: 2.34
    //я не программист и в офисе работать не хочу:)

    val v1: Int = 0 //data input from user
    val v2: Int = 0 //data input from user
    val s: Int = 0 //data input from user
    val t: Int = 0 //calc value

    //Solve this task with function
    meetingTimeCars(v1, v2, s)

    // Read the input value.
/*
    println("Hello, enter V1: ")
     v1 = readLine()!!.toInt()
    println("Please, enter V2: ")
    v2 = readLine()!!.toInt()
    println("Please enter S: ")
    s = readLine()!!.toInt()

    val vSblijenia = v1 + v2
    t = s / vSblijenia
*/



//попробую сначало решить задачку без фунции потом напишу функцию.

//    println("The time, when the cars will meeting: ${t} ")


}
fun meetingTimeCars(
    v1: Int,
    v2: Int,
    s: Int,// trailing comma
) {

    println("Hello, enter V1: ")
   val tmp1 =  readLine()!!.toInt()
    println("Please, enter V2: ")
    val tmp2 = readLine()!!.toInt()
    println("Please enter S: ")
    val tmp3 =  readLine()!!.toInt()

    val vSblijenia = tmp1 + tmp2
    val t = tmp3 / vSblijenia
    println("The time, when the cars will meeting: ${t} hour")
}