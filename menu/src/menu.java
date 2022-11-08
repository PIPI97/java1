import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Menu
                1. Draw the triangle
                2. Draw the square
                3. Draw the rectangle
                0. Exit
                Enter your choice:""");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
            }
            case 2 -> {
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
            }
            case 3 -> {
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
            }
            case 0 -> System.exit(0);
            default -> System.out.println("No choice!");
        }
    }
}

