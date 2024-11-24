import java.util.Scanner;

public class App {
    public static void reverse(int arr[]){
        int first =0;
        int last = arr.length -1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int size = scanner.nextInt();
    int arr[] = new int [size];
    System.out.println(" Enter the Elments in the Array: ");
    for(int i=0; i<arr.length; i++){
        arr[i]= scanner.nextInt();
    };
    reverse(arr);
    System.out.println("The Reverse Array is : ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
    scanner.close();
}
}
