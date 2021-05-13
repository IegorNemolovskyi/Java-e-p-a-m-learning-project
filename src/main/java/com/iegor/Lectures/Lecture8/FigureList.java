package com.iegor.Lectures.Lecture8;

public class FigureList {
    private AbstarctFigure [] masFigure;
    private int count;

    public FigureList() {
        this.masFigure = new AbstarctFigure[10];
        this.count = 0;
    }

    public FigureList(AbstarctFigure[] masFigure) {
        this.masFigure = masFigure;
        this.count = masFigure.length;
    }

    public void add (AbstarctFigure figure){
        if (count == masFigure.length)throw new ArrayIndexOutOfBoundsException();
        masFigure[count] = figure;
        count++;
    }

    public void showPerimeter(AbstarctFigure [] figures){
        System.out.println("***");
        for (AbstarctFigure figure: figures) {
            System.out.println(figure.perimeter());
        }
    }

    public AbstarctFigure getMaxPerimeter (AbstarctFigure [] figures){
        AbstarctFigure maxPerimeterFigure = figures[0];
        for (AbstarctFigure figure: figures) {
            if (figure.perimeter() > maxPerimeterFigure.perimeter())
                maxPerimeterFigure = figure;
        }
        return maxPerimeterFigure;
    }
}
