package sistema.application;

import java.util.Scanner;
import sistema.entities.Hospede;
import sistema.enums.FormaPag;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua cidade: ");
        String cidade = sc.next();

        System.out.println("Quantas pessoas: ");
        int quantity = sc.nextInt();

        System.out.println("Quantos dias vai ficar: ");
        int in = sc.nextInt();

        System.out.println("Quantos dias até check-out: ");
        int out = sc.nextInt();

        System.out.println("Qual o hotel: ");
        String but = sc.next();

        System.out.println("Deseja o Quarto-1/Quarto-2/Quarto-3");
        String quarto = sc.next();
        System.out.println();

        System.out.println("Qual a forma de pagamento (DEBITO, CREDITO, PIX, DINHEIRO):");
        String pagarTexto = sc.next().toUpperCase();
        FormaPag pagar = FormaPag.valueOf(pagarTexto);

        System.out.println("Valor do Quarto $220");
        System.out.println("Insira o valor: ");
        int price = sc.nextInt();

        Hospede hospe = new Hospede(cidade, quantity, in, out, but,pagar, price);

        System.out.println("Quartos do hotel... ");
        hospe.Hope();

        hospe.valor();
        System.out.println();
    }
}