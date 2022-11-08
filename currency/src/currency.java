import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USA");
        int usa = sc.nextInt();
        int vna = usa*23000;
        NumberFormat df = new DecimalFormat("#,###");
        String str = df.format(vna);
        System.out.println( str +" VND");
    }
}
