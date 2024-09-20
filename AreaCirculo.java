import java.util.Scanner;

public class AreaCirculo
{
    public static void main(String[] args)
    {
        double raio, area, pi;
        Scanner scan = new Scanner(System.in);

        pi = 3.1415d;
        raio = scan.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("A=%.4f\n", area);
    }
}

