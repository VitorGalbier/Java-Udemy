package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UserProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        List <Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for(int i = 1; i <= numberProducts; i++){
            System.out.println("Product Number #" + i);
            System.out.println("Common, used or imported (c/u/i): ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Price: ");
            Double price = sc.nextDouble();

            if(answer == 'i'){
                System.out.println("Custom fee: ");
                Double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }

            if(answer == 'u'){
                System.out.println("Manufacture Date: (DD/MM/YYYY) ");
                Date manufactureDate = sdf.parse(sc.nextLine());
                list.add(new UserProduct(name, price, manufactureDate));
            }

            else{
                list.add(new Product(name, price));
            }
        }

        System.out.println();

        System.out.println("Price Tags: ");

        for(Product product : list){
            product.priceTag();
        }

        sc.close();
    }
}
