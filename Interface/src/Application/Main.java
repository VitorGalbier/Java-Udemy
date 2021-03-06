package Application;

import Entities.CarRental;
import Entities.Vehicle;
import Service.BrazilTaxService;
import Service.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data ");
        System.out.println("Car model");
        String carModel = sc.nextLine();
        System.out.println("Pickup ");
        Date start = sdf.parse(sc.nextLine());
        System.out.println("Return ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter price per hour ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Enter price per day ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE ");
        System.out.printf("Basic payment " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.printf("Tax " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.printf("Total payment " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
