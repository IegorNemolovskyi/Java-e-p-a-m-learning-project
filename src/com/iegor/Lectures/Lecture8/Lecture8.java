package com.iegor.Lectures.Lecture8;

public class Lecture8 {
    public static void main(String[] args) {
        Circle f1 = new Circle(1, 2, 5);
        Rectangle f2 = new Rectangle(4, 6);
        AbstarctFigure [] masFigure = {f1, f2, new Circle(1, 3, 7 )};
        for (int i = 0; i < masFigure.length; i++) {
            masFigure[i].show();
        }
        FigureList figureList = new FigureList(masFigure);
        figureList.showPerimeter(masFigure);
        AbstarctFigure maxPerimeterFigure = figureList.getMaxPerimeter(masFigure);
//        System.out.println(maxPerimeterFigure);
//        maxPerimeterFigure.show();
        System.out.println(maxPerimeterFigure);
    }
}
