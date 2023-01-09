import java.util.Arrays;
import java.util.Objects;

public class Main {
    static boolean has(float[] array, float x) {
        refine(array);
        int i = 0;
        x=truncate(x,2);
//        System.out.println(x);
        boolean found = false;
        while (!found && i < array.length) {
            found = (array[i] == x);
            i++;
        }
        return found;
    }
    static float truncate(float a,int decimalplace){

        a*=Math.pow(10,decimalplace);
//        System.out.println(a);
        int b =(int)a;
//        System.out.println(a);
        a= (float) (b/Math.pow(10,decimalplace));
//        System.out.println("a "+ a);
        return a;

    }
    static void refine(float[] a){
        for (int i=0;i<a.length;i++){
            truncate(a[i],2);
//            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
      float[] a = {2.3f,45f,3.45f,6f,56f};
        System.out.println(has(a,3.4503456f));


//
//        int number = InputReader.readInt("How many strings do you want to store in the array?");
//        String[] strings = new String[number];
//        // TODO: read strings with a for loop using InputReader.readString("Enter string " + (i + 1));
//        for (int i=0;i<number;i++){
//            strings[i]=InputReader.readString("Enter string " + (i + 1));
//        }
//        String searchWord = InputReader.readString("Which string would you like to search?");
//        // TODO: invoke has with the correct parameters
//        int i = 0;
//        boolean found = false;
//        while (!found && i < strings.length) {
//            String first = strings[i].toLowerCase().replaceAll("\\s+"
//                    ,
//                    "");
//            String second = searchWord.toLowerCase().replaceAll("\\s+"
//                    ,
//                    "");
//            found = Objects.equals(first, second);
//            i++;
//        }
//
//        System.out.println("Found " + searchWord + " in " + Arrays.toString(strings) + ": " + found);

    }
}