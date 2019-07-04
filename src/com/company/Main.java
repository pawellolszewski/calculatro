package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skanowanie = new Scanner(System.in);


        String wybor;
        while (true)
        {
            System.out.println("Program do obliczania mocy Samochodu");
            System.out.println("Wybierz posiadaną moc: ");
            System.out.println();
            System.out.println("1 - MOC w kW [Jednostki Kilowata]");
            System.out.println("2 - MOC w KM [Konie Mechaniczne]");
            System.out.println();
            System.out.println("Powered by polszewski");
            System.out.println();
            wybor = skanowanie.nextLine();
            {
                switch (wybor) {
                    case "1":
                        System.out.println("Podaj wartosc kW:  ");
                        int kW = skanowanie.nextInt();
                        System.out.println("Twoja moc w kW to: " + kW + "co daje: " + (1.36 * kW) + " taka moc w KM ");
                        break;

                    case "2":
                        System.out.println("Podaj wartosc KM:  ");
                        int KM = skanowanie.nextInt();
                        System.out.println("Twoja moc w KM to: " + KM + " co daje: " + (KM / 1.36) + " taka moc w kW");
                        break;
                    default:
                        break;
                }

            }
        }

    }
}