package com.iegor.HW.HW6;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;
    public ArrayRectangles (int n) {
        rectangleArray = new Rectangle[n];
    }
    public ArrayRectangles(Rectangle... rectangles) {
        this.rectangleArray = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null){
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        int maxIndex = 0;
        double maxArea = rectangleArray[0].area();
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && rectangleArray[i].area() > maxArea ) {
                maxIndex = i;
                maxArea = rectangleArray[i].area();
            }
        }
        return maxIndex;
    }

    public int numberMinPerimeter() {
        int minIndex = 0;
        double minPerimeter = rectangleArray[0].perimeter();
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].perimeter() < minPerimeter) {
                minIndex = i;
                minPerimeter = rectangleArray[i].perimeter();
            }
        }
        return minIndex;
    }

    public int numberSquares() {
        int numberOfSquares = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].isSquare()) {
                numberOfSquares++;
            }
        }
        return numberOfSquares;
    }

    public void print() {
        for (int i = 0; i < rectangleArray.length; i++) {
            System.out.println(rectangleArray[i]);
        }
    }
}
