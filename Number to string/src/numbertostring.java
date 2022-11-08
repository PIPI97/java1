
import java.util.Scanner;

public class numbertostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        String result = "";
        if (number < 0) {
            result = "Too small";
        } else if (number == 0) {
            result = "zero";
        } else if (number < 100) {
            result = hundredsDigit(number);
        } else if (number < 1000) {
            int hundredsdigit = number / 100;
            result += onesDigit(hundredsdigit) + "hundred ";
            int tensdigit = number % 100;
            result += hundredsDigit(tensdigit);
        } else if (number == 1000)
            result = "one thousand";
        else {
            result = "Too large";
        }
        System.out.println(result);
    }

    public static String onesDigit(int onesdigit) {
        return switch (onesdigit) {
            case 1 -> "one ";
            case 2 -> "two ";
            case 3 -> "three ";
            case 4 -> "four ";
            case 5 -> "five ";
            case 6 -> "six ";
            case 7 -> "seven ";
            case 8 -> "eight ";
            default -> "nine ";
        };

    }

    public static String eletotweDigit(int number) {
        return switch (number) {
            case 10 -> "ten ";
            case 11 -> "eleven ";
            case 12 -> "twelve ";
            case 13 -> "thirteen ";
            case 14 -> "fourteen ";
            case 15 -> "fifteen ";
            case 16 -> "sixteen ";
            case 17 -> "seventeen ";
            case 18 -> "eighteen ";
            default -> "nineteen ";

        };
    }

    public static String tensDigit(int number) {
        int tensdigit =number / 10;
        return switch (tensdigit) {
            case 2 -> "twenty ";
            case 3 -> "thirty ";
            case 4 -> "forty ";
            case 5 -> "fifty ";
            case 6 -> "sixty ";
            case 7 -> "seventy ";
            case 8 -> "eighty ";
            default -> "ninety ";
        };
    }

    public static String hundredsDigit(int number) {
        String result = "";
        if (number > 0 && number < 10) {
            result = onesDigit(number);
        } else if (number < 20) {
            result = eletotweDigit(number);
        } else if (number < 100) {
            result += tensDigit(number);
            int onesdigit = number % 10;
            result += onesDigit(onesdigit);
        }
        return result;
    }
}


