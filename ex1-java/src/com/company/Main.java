package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Desafio 01
	    int x, y, result;

        x = input.nextInt();
        y = input.nextInt();
        result = x + y;
        System.out.printf("Os valores foram: %d e %d e o resultado foi %d", y, x, result);

        //Desafio 02

        float raio, pi, area;

        pi = (float) 3.14159;
        raio = input.nextFloat();
        area = (raio * raio) * pi;

        System.out.printf("O raio informado foi %.2f e area é de %.4f%n", raio, area);

        //Desfio 03

        int a, b, c, d, diferenca;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        diferenca = (a*b) - (c*d);
        System.out.printf("A difenrença é de %d ", diferenca);

        //Desafio 04

        int nFuncionario, horasTrabalhadas;
        float valorHora, salario;

        nFuncionario = input.nextInt();
        horasTrabalhadas = input.nextInt();
        valorHora = input.nextFloat();;
        salario = horasTrabalhadas*valorHora;

        System.out.printf("O número do funcionário é %d e seu salário é de %.2f%n", nFuncionario, salario);

        //Desafio 05

        int codepeca1, codepeca2, npeca1, npeca2;
        float valorpeca1, valorpeca2, totalPagar;

        codepeca1 = input.nextInt();
        npeca1 = input.nextInt();
        valorpeca1 = input.nextFloat();

        codepeca2 = input.nextInt();
        npeca2 = input.nextInt();
        valorpeca2 = input.nextFloat();

        totalPagar = (npeca1*valorpeca1) + (npeca2*valorpeca2);

        System.out.printf("Codigo da peça 1: %d; codigo da peça 2: %d; total: %.2f%n", codepeca1, codepeca2, totalPagar);

        //Desafio 06


        float k, l, m, trianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        k = input.nextFloat();
        l = input.nextFloat();
        m = input.nextFloat();

        trianguloRetangulo = (k*m)/2;
        areaCirculo = (m * m) * pi;
        areaTrapezio = ((k + l) * m)/2;
        areaQuadrado = l*l;
        areaRetangulo = k*l;

        System.out.printf("Area do triangulo Retangulo: %.3f%n, Area do circulo: %.3f%n, area do trapézio: %.3f%n, area do quadrado: %.3f%n, area do retângulo: %.3f%n", trianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        input.close();
    }
}
