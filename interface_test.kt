interface Arrayalbe {
    fun toArray()
}

interface Jsonable {
    fun toJson()
}

class Collection: Arrayalbe, Jsonable {
    override fun toArray() {
        println("to array")
    }
    
    override fun toJson() {
        println("to json")
    }
}

fun main() {
    var col = Collection()
    col.toArray()
    col.toJson()
}
