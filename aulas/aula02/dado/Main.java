public class Main {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        int a = dado1.getValor();
        System.out.println(a);
        dado1.lancar();
        a = dado1.getValor();
        System.out.println(a);
    }
}