import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int digits = Integer.parseInt(inp.nextLine());
        inp.close();

        boolean isNegative = digits < 0; 
        if (isNegative) {
            digits = -digits;
        }

        int sum = sumDigits(digits);

        if (isNegative) {
            sum = -sum;
        }

        System.out.println(sum);
    }

    static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumDigits(num / 10);
    }
}
