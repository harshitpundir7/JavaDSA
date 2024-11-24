import java.util.Scanner;

public class App {
    public static void Diamond(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num-1; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Diamond pattern: ");
        int num = scanner.nextInt();
        Diamond(num);
        scanner.close();
    }
}
