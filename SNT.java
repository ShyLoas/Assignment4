package assignment4;

public class SNT {

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to la: ");
        for (int i = 1; i <= 100; i++) {
            if (SNT(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean SNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
