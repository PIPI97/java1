import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money");
        double money= sc.nextDouble();
        System.out.println("Enter interest (%)");
        double interest = sc.nextDouble();
        System.out.println("Enter month");
        int month = sc.nextInt();
        double amount = money*Math.pow((1+((interest/100))/12),month);
        NumberFormat df = new DecimalFormat("#,###");
        String str = df.format(amount);
        System.out.println("your money: "+str +"vnd");

    }
}

