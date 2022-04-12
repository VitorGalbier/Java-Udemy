package entities;

public class Student {
    public String name;
    public double FirstGrade, SecondGrade, ThirdGrade;

    public Student(String name, double FirstGrade, double SecondGrade, double ThirdGrade){
        this.name = name;
        this.FirstGrade = FirstGrade;
        this.SecondGrade = SecondGrade;
        this.ThirdGrade = ThirdGrade;
    }

    public void calcMedia(){
        double media = (FirstGrade + SecondGrade + ThirdGrade)/3;

        if(media >= 60){
            System.out.printf("Final Grade: %.2f%n", media);
            System.out.printf("Pass!");
        }else{
            System.out.printf("Final Grade: %.2f%n", media);
            System.out.printf("Failed!");
            double missingPoints = 60 - media;
            System.out.printf("Missing: %.2f%n", missingPoints);
        }
    }
}
