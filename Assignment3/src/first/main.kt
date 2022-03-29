package first

fun main() {
    var flag = true
    //Rectangle
    var rectangle: Rectangle = Rectangle()
    println("Rectangle")
    do {//rectangle width
        try {
            print("enter Rectangle width: ")
            rectangle.setWidth(readLine()!!.toDouble())
            if (rectangle.getWidth() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    flag = true
    do {//rectangle length
        try {
            print("enter Rectangle length: ")
            rectangle.setLength(readLine()!!.toDouble())
            if (rectangle.getLength() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    rectangle.print()

    //Square
    println("square")
    var square: Square = Square()
    flag = true
    do {//square width
        try {
            print("enter square width: ")
            square.setWidth(readLine()!!.toDouble())
            if (square.getWidth() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    flag = true
    do {//square length
        try {
            print("enter square length: ")
            square.setLength(readLine()!!.toDouble())
            if (square.getLength() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    square.print()

    //Triangle
    println("Triangle")
    var triangle: Triangle = Triangle()
    flag = true
    do {//triangle width
        try {
            print("enter triangle base length: ")
            triangle.setBaseLength(readLine()!!.toDouble())
            if (triangle.getBaseLength() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    flag = true
    do {//triangle height
        try {
            print("enter triangle height: ")
            triangle.setHeight(readLine()!!.toDouble())
            if (triangle.getHeight() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    println("enter sides of Triangle")
    var triangleSides: ArrayList<Double> = ArrayList(3)
    for (i in 0..2){
        flag = true
        do {//triangle sides
            try {
                print("enter triangle side ${i+1}: ")
                triangleSides.add(readLine()!!.toDouble())
                if (triangle.getHeight() > 0.0)
                    flag = false
                else
                    println("you should enter +ve. no of value")
            }
            catch (e: NumberFormatException){
                println("you should enter Float no. of value")
            }
        }while (flag)
    }
    triangle.setLengths(triangleSides)
    triangle.print()
    //Ellipse
    println("Ellipse")
    var ellipse: Ellipse = Ellipse()
    flag = true
    do {//Ellipse a axis
        try {
            print("enter Ellipse A axis: ")
            ellipse.setAAxis(readLine()!!.toDouble())
            if (ellipse.getAAxis() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    flag = true
    do {//ellipse] b axis
        try {
            print("enter Ellipse B axis: ")
            ellipse.setBAxis(readLine()!!.toDouble())
            if (ellipse.getBAxis() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    ellipse.print()
    //Circle
    println("Circle")
    var circle: Circle = Circle()
    flag = true
    do {//circle a axis
        try {
            print("enter circle radius: ")
            circle.setRadius(readLine()!!.toDouble())
            if (circle.getRadius() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of value")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of value")
        }
    }while (flag)

    circle.print()
}