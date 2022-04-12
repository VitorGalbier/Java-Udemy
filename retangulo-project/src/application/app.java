package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();

        System.out.println("Valor da altura: ");
        retangle.height = sc.nextDouble();

        System.out.println("Valor da base: ");
        retangle.width = sc.nextDouble();

        System.out.printf("Area: %.2f%n", retangle.calcArea());

        System.out.printf("Perimetro: %.2f%n", retangle.calcPerimettro());

        System.out.printf("Diagonal: %.2f%n", retangle.calcDiagonal());

        sc.close();
    }
}
