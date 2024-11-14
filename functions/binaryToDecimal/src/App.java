import java.util.Scanner;

public class App {
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        while (binNum>0) {
            int lastDigit = binNum %10;
            decNum = decNum + (lastDigit* (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("the value of this Binary number is :"+ decNum);
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary Number : ");
        int n = scanner.nextInt();
        binToDec(n);
        scanner.close();
    }
}
