import java.util.Scanner;

public class App {
    public static int biggest (int arr[]){
        int max =arr[0]; 
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int value = scanner.nextInt();
        System.out.println("Enter the Elements in the Array: ");
        int arr[]= new int [value];
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("he Biggst Numbr is : ");
        int max = biggest(arr);
        System.out.println(max);
        scanner.close();
    }
}
