import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println(num + " is not prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " Is prime number");
            } else {
                System.out.println(num + " Is not prime number");
            }
        }
    }
}

