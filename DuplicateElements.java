import java.util.Scanner;

public class DuplicateElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter elements of Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate Elements in given Array are:");
        findDuplicates(arr);
        
        sc.close();
    }

    public static void findDuplicates(int[] arr){
        boolean duplicate = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate element found: " + arr[i]);
                    duplicate = true;
                    break;
                }
            }
        }
        if (!duplicate){
            System.out.println("No duplicate elements found");
        }
    }
}
