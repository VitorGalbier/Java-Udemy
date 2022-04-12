package entities;

public class Retangle {
    public double width;
    public double height;

    public double calcArea (){
        double area = width * height;
        return area;
    }

    public double calcPerimettro(){
        double perimetro = 2*(width + height);
        return perimetro;
    }

    public double calcDiagonal(){
        double diagonal = Math.sqrt((width * width) + (height * height));
        return diagonal;
    }
}
