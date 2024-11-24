import java.util.Scanner;

public class App {
    public static void zeroOne(int num){
        int m = 0;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(m);
                if(m==0){
                    m=1;
                }else{
                    m=0;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
    Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the length of the pyramid: ");
    int num = scanner.nextInt();
    zeroOne(num);
    scanner.close();
    }
}
