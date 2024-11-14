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
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter the Number : ");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));

    }
}
