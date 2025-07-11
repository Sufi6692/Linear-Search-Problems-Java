import java.util.Arrays;
import java.util.Scanner;

public class Find_Element_In_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = input.nextInt();
        if (n < 0){
            System.out.println("Kindly enter valued size of an greater than 0.");
            input.close();
            return;
        }
        int[] array = new int[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        System.out.print("Enter your target number in array: ");
        int key = input.nextInt();
       int ans =FindElement(array,key);
        if (ans!=-1){
            System.out.println("The target Number is exist at index : "+ans);
        }else {
            System.out.println("kindly enter a valid number that not exist in array ");
        }

        input.close();

    }
    static void ArrayInput(int[]array,Scanner input){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element in array at index "+i+" : ");
            array[i] = input.nextInt();

        }
    }
    static void ArrayOutput(int[]array){
        System.out.println(Arrays.toString(array));
    }
    static int FindElement(int[]array,int target){

        for (int i = 0; i < array.length; i++) {
            if (target==array[i]){
                 return i;


            }
        }
        return -1;
    }
}
