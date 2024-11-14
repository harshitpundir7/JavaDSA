import java.util.Scanner;

public class App {
    public static boolean isPrime(int x){
        if(x==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter this initial Number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the final Number: ");
        int n2 = scanner.nextInt();
        for(int i=n1; i<=n2; i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
        scanner.close();
    }
}
