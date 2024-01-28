interface Arrayalbe {
    var a: String
    fun toArray()
    fun toArray2() {
        println(this.a)
    }
}

interface Jsonable {
    fun toJson()
}

class Collection: Arrayalbe, Jsonable {
    override var a: String = "AAA"
    override fun toArray() {
        println("to array")
    }
    
    override fun toJson() {
        println("to json")
    }

    fun add(var a: Int) {
        println("add")
    }
}

fun main() {
    var col = Collection()
    col.toArray2()
    col.toJson()
}
