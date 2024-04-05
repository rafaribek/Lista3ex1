package br.cesul.shape;

public class Square {

    private double sideMea;
    public Square(double sideMea) {
        this.sideMea = sideMea;
    }

    public double finalArea(){
        double totalArea = sideMea * sideMea;
        return totalArea;
    }

    public double finalPerimeter(){
        double totalPerimeter = 4 * sideMea;
        return totalPerimeter;
    }

}

