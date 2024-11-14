import java.util.Scanner;

public class App {
    public static int fact(int a){
        int x=1;
        for(int i=1;i<=a; i++){
            x=i*x;
        }
        return x;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number: ");
        int a= scanner.nextInt();
        int ans = fact(a);
        System.out.println(ans);
    }
}
