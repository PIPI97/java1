import com.sun.tools.jconsole.JConsolePlugin;

import java.util.Scanner;

public class numbertostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        String result = "";
        if (number < 0) {
            result = "this is too small";
        } else if (number == 0) {
            result = "zero";
        } else if (number < 100) {
            result = hundredsDigit(number);
        } else if (number < 1000) {
            int hundredsdigit = (int) Math.floor(number / 100);
            result += onesDigit(hundredsdigit) + "hundred ";
            int tensdigit = number % 100;
            result += hundredsDigit(tensdigit);
        } else if (number == 1000)
            result = "one thousand";
        else {
            result = " this is too big";
        }
        System.out.println(result);
    }

    public static String onesDigit(int onesdigit) {
        String result = "";
        switch (onesdigit) {
            case 1:
                result += "one ";
                break;
            case 2:
                result += "two ";
                break;
            case 3:
                result += "three ";
                break;
            case 4:
                result += "four ";
                break;
            case 5:
                result += "five ";
                break;
            case 6:
                result += "six ";
                break;
            case 7:
                result += "seven ";
                break;
            case 8:
                result += "eight ";
                break;
            case 9:
                result += "nine ";
                break;
        }
        return result;
    }

    public static String eletotweDigit(int number) {
        String result = "";
        switch (number) {
            case 10:
                result = "ten ";
                break;
            case 11:
                result = "eleven ";
                break;
            case 12:
                result = "twelve ";
                break;
            case 13:
                result = "thirteen ";
                break;
            case 14:
                result = "fourteen ";
                break;
            case 15:
                result = "fifteen ";
                break;
            case 16:
                result = "sixteen ";
                break;
            case 17:
                result = "seventeen ";
                break;
            case 18:
                result = "eighteen ";
                break;
            case 19:
                result = "nineteen ";
                break;
        }
        return result;
    }

    public static String tensDigit(int number) {
        String result = "";
        int tensdigit = (int) Math.floor(number / 10);
        switch (tensdigit) {
            case 2:
                result += "twenty ";
                break;
            case 3:
                result += "thirty ";
                break;
            case 4:
                result += "forty ";
                break;
            case 5:
                result += "fifty ";
                break;
            case 6:
                result += "sixty ";
                break;
            case 7:
                result += "seventy ";
                break;
            case 8:
                result += "eighty ";
                break;
            case 9:
                result += "ninety ";
                break;
        }
        return result;
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


