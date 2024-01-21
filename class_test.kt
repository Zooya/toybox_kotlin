class Photo {
    val fileName: String = "aaa"
    var createdAt: Int = 345
    	private set(value) {
            field = value
        }
    var imgName: String = "image.jpg"
  		set(value) {
            println("start set imgName")
    		field = value + ".jpg"        
        }

    fun getImageName() {
		println(imgName)
	}
    
    fun setImageName(name: String) {
        println("start setImageName")
        imgName = name + ".png"
    }
   	
    fun setCreate(a: Int) {
        println("start setCreate")
        createdAt = a
    }
}

class Tube(var name: String) {
    fun printName() {
        println("start printName")
		println(this.name)        
    }
}

fun main() {
    var photo = Photo()
    photo.getImageName()
    photo.imgName = "image2"
    photo.setImageName("image3")
	println(photo.imgName)
    
    println(photo.fileName)
    
    photo.setCreate(123)
// 	photo.createdAt = 123
    println(photo.createdAt)

    var tube = Tube("AAA")
    println(tube.name)
    tube.printName()
}
