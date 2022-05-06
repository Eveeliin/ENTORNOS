

import java.util.Scanner;

public class ComprobarFecha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca día: ");
        int dia = sc.nextInt();
        System.out.println("Introduzca mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduza el año: ");
        int año = sc.nextInt();
        int bisiesto = año % 4;

        if ((dia >=1 || dia <=31) && (mes == 1 || mes == 3 ||mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (año != 0)){
            System.out.println(dia + "/" + mes + "/" + año + " Fecha Correcta");
        } else if ((dia >=1 || dia <=30) && (mes == 4 || mes == 6 ||mes == 9 || mes == 11) && (año != 0)) {
            System.out.println( dia + "/" + mes + "/" + año + " Fecha Correcta");
        } else if ((dia >=1 || dia <=29) && (mes == 2) && (año != 0) && (bisiesto == 0)){
            System.out.println(dia + "/" + mes + "/" + año + " Fecha Correcta");

        }else if ((dia >=1 || dia <=28) && (mes == 2) && (año % 4 == 0 && año % 100 != 0 || año % 400 == 0)){
            System.out.println(dia + "/" + mes + "/" + año + " Fecha Correcta");

        }else {
            System.out.println(dia + "/" + mes + "/" + año + " Fecha Incorrecta");
        }

    }
}
