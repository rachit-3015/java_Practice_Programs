import java.util.*;
import java.util.stream.*;


public class RotateAsAsked{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int input = sc.nextInt();
        int arr [] = new int[input];
        for(int i = 0 ; i < input; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotation type either right or left : ");
        String str = sc.next();
        System.out.println("How many : ");
        int rotation = sc.nextInt();
        if(str.equals("right")){
            rotateRight(arr,rotation);
            getPrinted(arr);
        }else{
            rotateLeft(arr,rotation);
            getPrinted(arr);
        }

    }
    private static void rotateRight(int arr [],int rotation){
        for(int i = 0 ; i < rotation ; i++){
            int temp = arr[arr.length-1];
            for(int j = arr.length-1 ; j >  0 ; j--){
                arr[j] = arr[j-1];
            }
            arr[0]=temp;
        }
    }
    private static void rotateLeft(int arr [],int rotation){
        for(int i = 0 ; i < rotation ; i++){
            int temp = arr[0];
            for(int j = 0 ; j < arr.length-1 ; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
    }
    private static void getPrinted(int arr []){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}