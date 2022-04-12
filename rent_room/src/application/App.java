package application;

import entities.Student;

public class App {
    public static void main(String[] args){

        Student[] vect = new Student[9];

        vect[5] = new Student("Maria Green", "maria@gmail.com");
        vect[1] = new Student("Marco Antonio", "marco@gmail.com");
        vect[8] = new Student("Alex Brown", "alex@gmail.com");
        int id = 0;

        for(int i = 0; i < vect.length; i++){
            if(vect [i] != null){
                id++;
                System.out.printf("Rent # %d%n", id);
                System.out.printf("Name: %s%n", vect[i].getName());
                System.out.printf("email: %s%n", vect[i].getEmail());
                System.out.printf("Room: %d%n", i);

            }
            else{
                System.out.println();
                System.out.printf("Room %d availabre! %n", i);
                System.out.println();
            }
        }
    }
}
