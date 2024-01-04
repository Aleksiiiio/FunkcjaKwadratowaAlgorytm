import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Podaj wspolczynnyki a,b,c równania kwadratowego");
        double a = scaner.nextDouble();
        double b = scaner.nextDouble();
        double c = scaner.nextDouble();
        System.out.println("Podaj x dla jakiego chcesz szukac");
        double x = scaner.nextDouble();

        double wynik = (a*(x*x)) + (b*x) + c;
        System.out.println("Twoja wartosc wynosi: "+wynik);
    }
}
