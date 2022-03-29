package first

class Square: Rectangle {
    constructor(){
        Rectangle()
    }
    constructor(length: Double){
        Rectangle(length, length)
    }

    //print data about current shape
    override fun print(){
        println("Area of Square: ${calculateArea()}, and Parameter is: ${calculateParimeter()}")
    }
}