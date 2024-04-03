import java.util.Scanner;

public class docsothanhchu {

    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String readNumber(int num) {
        if (num == 0) {
            return "zero";
        }

        String result = "";
        if (num >= 100) {
            result += ones[num / 100] + " hundred ";
            num %= 100;
        }

        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }

        if (num >= 11 && num <= 19) {
            result += teens[num - 10];
        } else {
            result += ones[num];
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số nguyên có tối đa 3 chữ số ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 999) {
            System.out.println("nhap so co 3 chu so");
        } else {
            System.out.println(readNumber(number));
        }
    }
}

