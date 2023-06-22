package br.com.pedroestudo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o limite do cartão");
        double limit = scan.nextDouble();
        Bank bank = new Bank(limit);

        int option = 1;

        while (option != 0) {
            System.out.println("Digite a descrição da compra");
            String description = scan.next();

            System.out.println("Digite o valor da compra");
            Double value = scan.nextDouble();

            Buy buy = new Buy(description, value);
            boolean success = bank.buyed(buy);

            if (success) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                option = scan.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                option = 0;
            }
        }

        System.out.println("*******************");
        System.out.println("COMPRAS REALIZADAS\n");

        for (Buy b: bank.getBuys()) {
            System.out.println(b.getDescription()+ "-"+b.getValue());
        }
        System.out.println("\n*****************");
        System.out.println("Saldo do cartão: "+bank.getCreditLimit());
    }
}
