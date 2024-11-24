import java.util.Scanner;

public class App {
    public static void invertRotated(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of pyramid: ");
        int number = scanner.nextInt();
        invertRotated(number);
        scanner.close();
    }
}
