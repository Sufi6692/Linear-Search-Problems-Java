import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search_In_String_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = input.nextInt();
        if (n < 0){
            System.out.println("Kindly enter valued size of an greater than 0.");
            input.close();
            return;
        }
        String[] array = new String[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        System.out.print("Enter your word  in array: ");
        String key = input.next();
        int ans =FindElement(array,key);
        if (ans!=-1){
            System.out.println("The word  is exist at index : "+ans);
        }else {
            System.out.println("kindly enter a valid word that not exist in array ");
        }

        input.close();

    }
    static void ArrayInput(String []array,Scanner input){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element in array at index "+i+" : ");
            array[i] = input.next();

        }
    }
    static void ArrayOutput(String[]array){
        System.out.println(Arrays.toString(array));
    }
    static int FindElement(String[]array,String target){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(target)){
                return i;


            }
        }
        return -1;
    }
}
