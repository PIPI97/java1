import java.util.Scanner;

public class drawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Menu
                1. Draw the rectangle
                2. Draw the square
                3. Print the square triangle
                4.Print isosceles triangle
                0. Exit
                Enter your choice:""");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter height :");
                int height = sc.nextInt();
                System.out.println("Enter width :");
                int width = sc.nextInt();
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < width; i++) {
                    result.append(" * ".repeat(Math.max(0, height)));
                    result.append("\n");
                }
                System.out.println(result);
            }
            case 2 -> {
                System.out.println("Enter side width :");
                int width = sc.nextInt();
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < width; i++) {
                    result.append(" * ".repeat(width));
                    result.append("\n");
                }
                System.out.println(result);
            }
            case 3 ->{System.out.println("Enter side width :");
                int width = sc.nextInt();
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < width; i++) {
                    result.append(" * ".repeat(i + 1));
                    result.append("\n");
                }
                System.out.println(result);
            }
            case 4 ->{
                System.out.println("Enter side width :");
                int width = sc.nextInt();
                String result = "";
                for (int i = 0; i<width;i++){
                    for (int j =0; j<width-i;j++){
                        result += " * ";
                    }
                    result+= "\n" ;
                }
                System.out.println(result);
            }
        }
    }
}
