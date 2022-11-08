import java.util.Scanner;

public class primenumber_20 {
    public static void main(String[] args) {
        System.out.println(" 20 số nguyên tố đầu tiên là: ");
        int num = 2;
        int count = 1;
        while (count <= 20) {

            boolean isprime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(num + ",");
                count++;
                num++;
            } else {
                num++;
            }
        }
    }
}

