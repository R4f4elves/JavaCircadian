package atividadeJavaListas;

import java.util.Scanner;

public class javaDiaTardeNoite {
    public static void main(String[] args) {
        Integer hora;

        System.out.println("Informe as horas: ");
        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();

        if (hora < 0 || hora >= 24) {
            System.out.println("Informe um horário válido");
        }
        else if (hora >= 0 && hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora >= 12 && hora <= 18) {
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println("Boa Noite!");
        }
        sc.close();
    }
}

