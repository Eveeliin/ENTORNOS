import java.util.Scanner;

public class ComprobarFechas3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introuzca dia: ");
            int dia = sc.nextInt();
            System.out.println("Introzuca mes: ");
            int mes = sc.nextInt();
            System.out.println("Introuzca año: ");
            int año = sc.nextInt();
            boolean fechaCorrecta;
            int bisiesto = 28;

            if (año == 0) {
                fechaCorrecta = false;
            } else if (mes == 2 && (1 <= dia && dia <= 28) || año % 4 == 0 && año % 100 != 0 && (1 <= dia && dia <= 29) || año % 400 == 0 && (1 <= dia && dia <= 29)) {
                fechaCorrecta = true;
                System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && (1 <= dia && dia <= 30)) {
                fechaCorrecta = true;
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && (1 <= dia && dia <= 31)) {
                fechaCorrecta = true;
                System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
            } else {
                System.out.println("La fecha que ha introducido es incorrecta.");
            }

        }
    }


