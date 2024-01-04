import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Podaj wspolczynnyki a,b,c równania kwadratowego");
        double a = scaner.nextDouble();
        double b = scaner.nextDouble();
        double c = scaner.nextDouble();

        double delta;
        double x1;
        double x2;

        if (a == 0 && b == 0 && c == 0) System.out.println("Równanie ma nieskończenie wiele rozwiązań");
        else if (a == 0 && b == 0 && c != 0) System.out.println("Równanie sprzeczne");
        else if (a == 0 && b != 0 && c != 0) {
            x1 = -c/b;
            System.out.printf("Równanie ma jedno rozwiazanie: %.2f\n",x1);
        }
        else if (a != 0 && b != 0 && c == 0) {
            x1 = 0;
            x2 = -b/a;
            System.out.printf("Równanie ma dwa rozwiazania: %.2f i %.2f\n",x1,x2);
        }
        else if ((a > 0 && b == 0 && c < 0) || (a < 0 && b == 0 && c > 0) ) {
            x1 = Math.sqrt(-c/a);
            x2 = -Math.sqrt(-c/a);
            System.out.printf("Równanie ma dwa rozwiazania: %.2f i %.2f\n",x1,x2);
        }
        else if (a!=0 && b == 0 && c == 0) {
            x1 = 0;
            System.out.printf("Równanie ma jedno rozwiazanie: %.2f\n",x1);
        }
        else if (a != 0 && b != 0 && c != 0) {
            delta = (b*b) - (4*a*c);
            if(delta < 0) System.out.println("Równanie nie ma rozwiązania");
            else if(delta == 0) {
                x1 = -b/(2*a);
                System.out.printf("Równanie ma jedno rozwiazanie: %.2f\n",x1);
            }
            else if(delta > 0){
                if (b >= 0 ) x1 = (-b-Math.sqrt(delta))/(2*a);
                else x1 = (-b+Math.sqrt(delta))/(2*a);
                x2 = c/(a*x1);
                System.out.printf("Równanie ma dwa rozwiazania: %.2f i %.2f\n",x1,x2);
            }
        }
        else System.out.println("Równanie nie ma pierwiastków");

    }
}