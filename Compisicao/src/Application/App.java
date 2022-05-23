package Application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Nível: ");
        String nivel = sc.nextLine();
        System.out.println("Salário Base: ");
        double salarioBase = sc.nextDouble();

        Worker trabalhador = new Worker(nome, WorkerLevel.valueOf(nivel), salarioBase, new Department(nomeDepartamento));

        System.out.println("Quantos contratos tem esse trabalhador? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Contrato número: " + (i+1));
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractData = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração do contrato: ");
            int hours = sc.nextInt();
            HourContract contrato = new HourContract(contractData, valorHora, hours);
            trabalhador.addContract(contrato);
        }

        System.out.println();

        //pegar mes e ano
        System.out.print("Entre com mês e ano para calcular o salário: ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartment().getName());
        System.out.println("Income for: " + mesAno + ": " +  trabalhador.income(mes, ano));

        sc.close();
    }
}
