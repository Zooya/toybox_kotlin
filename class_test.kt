class Photo {
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
}

fun main() {
    var photo = Photo()
    photo.getImageName()
    photo.imgName = "image2"
    photo.setImageName("image3")
	println(photo.imgName)
}
