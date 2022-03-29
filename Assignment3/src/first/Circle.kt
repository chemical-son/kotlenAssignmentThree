package first

class Circle : Ellipse{
    private var radius: Double = 0.0

    constructor(){
        radius = 0.0
    }
    constructor(radius: Double){
        Ellipse(radius, radius)
    }


    //setters
    fun setRadius(radius: Double){
        if(radius > -1)
            this.radius = radius
        else
            this.radius = 0.0
    }
    //getters
    fun getRadius(): Double {
        return radius
    }

    //circle functions
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculateParimeter(): Double {
        return Math.PI * radius * 2
    }


    //print data about current shape
    override fun print(){
        println("Area of Circle: ${calculateArea()}, and Parameter is: ${calculateParimeter()}")
    }
}