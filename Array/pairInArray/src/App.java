import java.util.Scanner;

public class App {
    public static void pairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int size = scanner.nextInt();
    int arr[] = new int [size];
    System.out.println(" Enter the Elments in the Array: ");
    for(int i=0; i<arr.length; i++){
        arr[i]= scanner.nextInt();
    };
    System.out.println("The Pairs are: ");
    pairs(arr);

    scanner.close();
    }
}
