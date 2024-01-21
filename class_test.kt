class Photo {
  private var imgName: String = "image.jpg"
  
  fun getImageName() {
	println("${imgName}")
  }
}

fun main() {
    var photo = Photo()
    photo.getImageName()
}
