import java.util.Scanner;

public class HelloWorld {
    public static int soma(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello World");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = soma(x, y);
        System.out.println("A soma de x + y é " + z);
        sc.close();
    }

}