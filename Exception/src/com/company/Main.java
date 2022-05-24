package com.company;

import Entities.Reservation;
import Model.Exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date: ");
            Date checkin = sdf.parse(sc.next());
            System.out.println("Check-out date: ");
            Date checkout = sdf.parse(sc.next());

//        if(!checkout.after(checkin)){
//            System.out.println("Error in reservation!");
//        }
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update reservation: ");
            System.out.println("Check-in date: ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date: ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format!");
        }

        catch (DomainException e){                 //mensagem que coloqueie na exceção
            System.out.println("Error in reservation: " + e.getMessage());
        }
//
        sc.close();
    }
}
