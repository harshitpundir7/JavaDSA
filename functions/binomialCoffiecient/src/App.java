import java.util.Scanner;

public class App {
    public static int fact(int a){
        int x=1;
        for(int i=1; i<=a; i++){
            x = i*x;
        }
        return x;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of r: ");
        int r = scanner.nextInt();
        int nr = n - r;
        int nF = fact(n);
        int rF = fact(r);
        int nrF = fact(nr);
        int pre = rF * nrF;
        int ans = nF / pre;
        System.out.println(ans);
    }
}
