import java.util.Scanner;

public class ComprobarFecha1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una fecha");
        System.out.println("====================");
        System.out.print("Día: ");
        int day = teclado.nextInt();
        System.out.print("Mes: ");
        int month = teclado.nextInt();
        System.out.print("Año: ");
        int year = teclado.nextInt();

        boolean bisiesto = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 1 )) {
            System.out.println("El formato introducido es incorrecto");
        } else if ((day > 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("El formato introducido es incorrecto");
        } else if (!bisiesto && (month == 2) && (day > 28)) {
            System.out.println("El formato introducido es incorrecto");
        } else if (bisiesto && (month == 2) && (day > 29)) {
            System.out.println("El formato introducido es incorrecto");
        } else {
            System.out.print("\nLa fecha introducida es correcta!");
        }
    }
}
