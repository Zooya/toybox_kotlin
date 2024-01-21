/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun <A>readList(members: List<A>, someFunction: (A) -> Unit ) {
  for( person in members ) {
    someFunction( person )
  }
}

fun readList2(members: List<String>, someFunction: (String) -> Unit ) {
  for( person in members ) {
    someFunction( person )
  }
}

fun main() {
//     var a = arrayOf(1,2,3,7)
//     var n = "こんにちは${a[3]}これが最初の文字${a.size}"
//     var n1 = """
//     	|こんにちは
// 		|これが最初の文字
//         |なんですよ
//     """.trimMargin()
//     println(n)
//     println(n1)

    val members = listOf("Tom", "Jerry" ,"Bob", "Olibia" )
    val numbers = listOf( 1, 3, 5, 7 )

    readList( members, ::println)
    readList( numbers, ::println)
}
