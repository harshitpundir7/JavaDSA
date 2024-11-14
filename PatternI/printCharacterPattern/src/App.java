import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char ch = 'A';
        for(int i=1; i<=n; i++){
           for(int j=1; j<=i; j++){
            System.out.print(ch);
            ch++;
           } 
           System.out.println();
        }
        scanner.close();
    }
}
