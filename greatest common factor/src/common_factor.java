import java.util.Scanner;

public class common_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int fnum = Math.abs(sc.nextInt());
        System.out.println("Enter 2st Number :");
        int snum = Math.abs(sc.nextInt());
        if (fnum ==0 || snum==0){
            System.out.println("Does not have greatest common factor ");
            return;
        }
        while (fnum != snum) {
            if (fnum > snum) {
                fnum = fnum - snum;
            } else {
                snum = snum - fnum;
            }
        }
        System.out.println(fnum+" is greatest common factor");
    }
}
