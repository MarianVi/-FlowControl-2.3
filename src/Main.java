
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int n = scanner.nextInt();

        int numarMinimCifre = 0;
        int numarMaximCifre = 0;
        int cifreMinim = Integer.MAX_VALUE;
        int cifreMaxim = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int numar = scanner.nextInt();
            int numarCopy = numar;
            int numarCifre = 0;

            if (numar == 0) {
                numarCifre = 1;
            } else {
                while (numar != 0) {
                    numar = numar / 10;
                    numarCifre++;
                }
            }

            if (numarCifre < cifreMinim) {
                cifreMinim = numarCifre;
                numarMinimCifre = numarCopy;
            }

            if (numarCifre > cifreMaxim) {
                cifreMaxim = numarCifre;
                numarMaximCifre = numarCopy;
            }
        }

        System.out.println("Numar minim de cifre: " + numarMinimCifre);
        System.out.println("Numar maxim de cifre: " + numarMaximCifre);
    }
}
