import java.util.Scanner;

public class App {
    public static void floydTriangle(int num){
        int m=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter th length of the pyramid: ");
        int num = scanner.nextInt();
        floydTriangle(num);
        scanner.close();
    }
}
