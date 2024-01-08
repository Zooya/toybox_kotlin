/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var a = arrayOf(1,2,3,7)
    var n = "こんにちは${a[3]}これが最初の文字${a.size}"
    var n1 = """
    	|こんにちは
		|これが最初の文字
        |なんですよ
    """.trimMargin()
    println(n)
    println(n1)
}
