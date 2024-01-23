package application;

import java.util.Scanner;
import entities.Rent;

public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Quantos quartos serão alugados? ");
        int n = keyboard.nextInt();
        int x = 1;

        Rent [] vect = new Rent [10];


        for (int i = 0; i < n; i++) {
            keyboard.nextLine();
            System.out.println("Rent #" + x);
            System.out.print("Name: ");
            String name = keyboard.nextLine();
            System.out.print("Email: ");
            String email = keyboard.nextLine();
            System.out.print("Room: ");
            int room = keyboard.nextInt();
            Rent rent = new Rent(name, email);
            vect[room] = rent;
            x++;
        }
        System.out.println("Busy Rooms: ");

        for (int i = 0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ", "+ vect [i]);

            }
        }

        keyboard.close();

    }

}
