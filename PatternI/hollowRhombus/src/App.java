import java.util.Scanner;

public class App {
    public static void hollowRhombus(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                if(i==1 || i== num || j==1|| j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Hollow Rhombus: ");
        int num = scanner.nextInt();
        hollowRhombus(num);
        scanner.close();
    }
}
