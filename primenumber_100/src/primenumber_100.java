public class primenumber_100 {
    public static void main(String[] args) {
        System.out.println(" Số nguyên tố nhỏ hơn 100: ");
        int num = 2;
        while (num < 100) {
            boolean isprime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(num + ",");
                num++;
            } else {
                num++;
            }
        }
    }
}
