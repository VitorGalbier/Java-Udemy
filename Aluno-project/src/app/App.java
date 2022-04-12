package app;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("First Grade: ");
        double FirstGrade = sc.nextDouble();

        System.out.println("Second Grade: ");
        double SecondGrade = sc.nextDouble();

        System.out.println("Third Grade: ");
        double ThirdGrade = sc.nextDouble();

        Student student = new Student(name, FirstGrade, SecondGrade, ThirdGrade);

        student.calcMedia();

        sc.close();
    }
}
