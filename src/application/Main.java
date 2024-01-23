package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = keyboard.nextInt();
        int x = 1;
        double media = 0;
        double idadeMenor = 0;
        String[] vectName = new String[n];
        int[] vectIdade = new int[n];
        double[] vectAltura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + x + "a pessoa");
            keyboard.nextLine();
            System.out.print("Nome: ");
            String name = keyboard.nextLine();
            System.out.print("Idade: ");
            int idade = keyboard.nextInt();
            if (idade < 16) {
                idadeMenor++;
            }
            System.out.print("Altura: ");
            double altura = keyboard.nextDouble();
            vectName[i] = name;
            vectIdade[i] = idade;
            vectAltura[i] = altura;
            media += altura;
            x++;
        }

        media /= n;
        System.out.printf("Altura média = %.2f %n", media);

        idadeMenor = (idadeMenor * 100) / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%n", idadeMenor);

        for (int i = 0; i < n; i++) {
            if (vectIdade[i] < 16) {
                System.out.println(vectName[i]);
            }

        }
        keyboard.close();

    }

}
