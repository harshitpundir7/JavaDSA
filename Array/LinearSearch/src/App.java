import java.util.Scanner;

public class App {
    public static int search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements in the Array : ");
        int arr [] = new int [9];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter th key you wants to search in the array: ");
        int key = scanner.nextInt();
        int answer = search(arr, key);
        if(answer!=-1){
            System.out.println("Yes the Key exist at the index: ");
            System.out.println(answer);
        }else{
            System.out.println("No there is no such key exist in the array");
        }
        scanner.close();
    }
}
