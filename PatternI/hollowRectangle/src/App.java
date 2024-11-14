import java.util.Scanner;

public class App {
    public static void hollowRectangle(int totRow, int totCol){
        for(int i=1; i<=totRow; i++){
            for(int j=1; j<=totCol; j++){
                if(i==1 || j==1 || i==totRow || j==totCol ){
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
        System.out.println("Enter the number of Row in Matrix: ");
        int totRow = scanner.nextInt();
        System.out.println("Enter the number of column in the Matrix: ");
        int totCol = scanner.nextInt();
        hollowRectangle(totRow, totCol);
        scanner.close();
    }
}
