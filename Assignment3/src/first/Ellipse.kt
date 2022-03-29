package first

open class Ellipse: Shape {
    private var aAxis: Double = 0.0
    private var bAxis: Double = 0.0

    constructor(){
        aAxis = 0.0
        bAxis = 0.0
    }
    constructor(aAxis: Double, bAxis: Double){
        setAAxis(aAxis)
        setBAxis(bAxis)
    }


    //setters
    fun setAAxis(aAxis: Double){
        if(aAxis > -1)
            this.aAxis = aAxis
        else
            this.aAxis = 0.0
    }
    fun setBAxis(bAxis: Double){
        if(bAxis > -1)
            this.bAxis = bAxis
        else
            this.bAxis = 0.0
    }
    //getters
    fun getAAxis(): Double {
        return aAxis
    }
    fun getBAxis(): Double {
        return bAxis
    }

    //Ellipse functions
    override fun calculateArea(): Double {
        return Math.PI * aAxis * bAxis
    }

    override fun calculateParimeter(): Double {
        return Math.PI * (aAxis + bAxis )
    }

    //print data about current shape
    open fun print(){
        println("Area of Ellipse: ${calculateArea()}, and Parameter is: ${calculateParimeter()}")
    }
}