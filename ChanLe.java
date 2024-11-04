package assignment4;

public class ChanLe {

    public static void main(String[] args) {
        int odd = 0, even = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("Tong so chan: " + even);
        System.out.println("Tong so le: " + odd);
    }
}
