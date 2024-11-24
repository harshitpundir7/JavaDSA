import java.util.Scanner;

public class App {
    public static void invertedNumber(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        int num = scanner.nextInt();
        invertedNumber(num);
        scanner.close();
    }
}
