package first

open class Rectangle: Shape {
    private var length: Double = 0.0
    private var width: Double = 0.0

    constructor(length:Double, width: Double){
        setLength(length)
        setWidth(width)
    }
    constructor(){
        this.length = 0.0
        this.width = 0.0
    }

    //setters
    fun setLength(length: Double){
        if(length > -1)
            this.length = length
        else
            this.length = 0.0
    }
    fun setWidth(width: Double){
        if(width > -1)
            this.width = width
        else
            this.width = 0.0
    }
    //getters
    fun getLength(): Double {
        return length
    }
    fun getWidth(): Double {
        return width
    }

    //Rectangle functions
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculateParimeter(): Double {
        return length + width
    }

    //print data about current shape
    open fun print(){
        println("Area of Rectangle: ${calculateArea()}, and Parameter is: ${calculateParimeter()}")
    }
}