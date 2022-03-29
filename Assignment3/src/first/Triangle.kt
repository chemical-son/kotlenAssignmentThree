package first

class Triangle: Shape {
    private var baseLength: Double = 0.0
    private var height: Double = 0.0
    private var lengths: ArrayList<Double> = ArrayList(3)
    constructor(){
        baseLength = 0.0
        height = 0.0
    }
    constructor(baseLength: Double, height: Double, lengths: ArrayList<Double>){
        setBaseLength(baseLength)
        setHeight(height)
        setLengths(lengths)
    }


    //setters
    fun setBaseLength(baseLength: Double){
        if(baseLength > -1)
            this.baseLength = baseLength
        else
            this.baseLength = 0.0
    }
    fun setHeight(height: Double){
        if(height > -1)
            this.height = height
        else
            this.height = 0.0
    }
    fun setLengths(lengths: ArrayList<Double> /* = ArrayList<kotlin.Double> */){
        for (i in 0..2){
            if(lengths[i] > 0)
                this.lengths.add(lengths[i])
            else
                this.lengths.add(1.0)
        }
    }
    //getters
    fun getBaseLength(): Double {
        return baseLength
    }
    fun getHeight(): Double {
        return height
    }

    fun getLengths():ArrayList<Double>{
        return this.lengths
    }

    //Triangle functions
    override fun calculateArea(): Double {
        return 0.5 * baseLength * height
    }

    override fun calculateParimeter(): Double {
        return lengths[0] + lengths[1] + lengths[2]
    }

    //print data about current shape
    open fun print(){
        println("Area of Triangle: ${calculateArea()}, and Parameter is: ${calculateParimeter()}")
    }
}