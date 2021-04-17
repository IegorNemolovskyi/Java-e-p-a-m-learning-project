package com.iegor.HW.HW6;

public class HW6 {
    public static void main (String[] args){
        //    Task #5 Classes
//    Task:
//    Develop Rectangle and ArrayRectangles with a predefined functionality.
//
//    On a Common level it is obligatory:
//
//    To develop Rectangle class with following content:
//
//    2 closed real fields sideA and sideB (sides А and В of the rectangle)
//    Constructor with two real parameters a and b (parameters specify rectangle sides)
//    Constructor with a real parameter a (parameter specify side А of a rectangle, side B is always equal to 5)
//    Constructor without parameters (side А of a rectangle equals to 4, side В - 3)
//    Method getSideA, returning value of the side А
//    Method getSideВ, returning value of the side В
//    Method area, calculating and returning the area value
//    Method perimeter, calculating and returning the perimeter value
//    Method isSquare, checking whether current rectangle is shape square or not. Returns true if the shape is square and false in another case.
//    Method replaceSides, swapping rectangle sides
//
//    On an Advanced level also needed:
//
//    Complete Level Low Assignment
//
//    Develop class ArrayRectangles, in which declare:
//
//    Private field rectangleArray  - array of rectangles
//    Constructor creating an empty array of rectangles with length n
//    Constructor that receives an arbitrary amount of objects of type Rectangle or an array of objects of type Rectangle.
//    Method addRectangle that adds a rectangle of type Rectangle to the array on the nearest free place and returning true, or returning false, if there is no free space in the array
//    Method numberMaxArea, that returns order number (index) of the rectangle with the maximum area value (numeration starts from zero)
//    Method numberMinPerimeter, that returns order number(index) of the rectangle with the minimum area value (numeration starts from zero)
//    Method numberSquares, that returns the number of squares in the array of rectangles

        // Rectangle 1
        Rectangle rectangle = new Rectangle(1,3);
        rectangle.print();
        System.out.println("The Rectangle is square: "+ rectangle.isSquare());
        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());
        System.out.println("");

        // Rectangle 2
        Rectangle rectangle2 = new Rectangle(5);
        rectangle2.print();
        System.out.println("The Rectangle is square: "+ rectangle2.isSquare());
        System.out.println("Area = " + rectangle2.area());
        System.out.println("Perimeter = " + rectangle2.perimeter());
        System.out.println("");

        // Rectangle 3
        Rectangle rectangle3 = new Rectangle();
        rectangle3.print();
        System.out.println("The Rectangle is square: "+ rectangle3.isSquare());
        System.out.println("Area = " + rectangle3.area());
        System.out.println("Perimeter = " + rectangle3.perimeter());
        System.out.println("");

        // Rectangle 4
        Rectangle rectangle4 = new Rectangle(7,7);
        rectangle4.print();
        System.out.println("The Rectangle is square: "+ rectangle4.isSquare());
        System.out.println("Area = " + rectangle4.area());
        System.out.println("Perimeter = " + rectangle4.perimeter());
        System.out.println("");

        // Rectangle 5
        Rectangle rectangle5 = new Rectangle(1,1);
        rectangle5.print();
        System.out.println("The Rectangle is square: "+ rectangle5.isSquare());
        System.out.println("Area = " + rectangle5.area());
        System.out.println("Perimeter = " + rectangle5.perimeter());
        System.out.println("");

        // Rectangle 6
        Rectangle rectangle6 = new Rectangle(7,1);
        rectangle6.print();
        System.out.println("The Rectangle is square: "+ rectangle6.isSquare());
        System.out.println("Area = " + rectangle6.area());
        System.out.println("Perimeter = " + rectangle6.perimeter());
        System.out.println("");

        // ArrayRectangle
        ArrayRectangles arrayRectangles = new ArrayRectangles(5);
        arrayRectangles.addRectangle(rectangle);
        arrayRectangles.addRectangle(rectangle2);
        arrayRectangles.addRectangle(rectangle3);
        arrayRectangles.addRectangle(rectangle4);
        arrayRectangles.addRectangle(rectangle5);
        arrayRectangles.addRectangle(rectangle6);
        arrayRectangles.print();
        System.out.println(arrayRectangles.addRectangle(rectangle));
        System.out.print("Max Area Rectangle index is: ");
        System.out.println(arrayRectangles.numberMaxArea());
        System.out.print("Min Perimeter Rectangle index is: ");
        System.out.println(arrayRectangles.numberMinPerimeter());
        System.out.print("Number of squares is: ");
        System.out.println(arrayRectangles.numberSquares());
    }
}
