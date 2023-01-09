import java.util.Arrays;

public class InsertionSort {

    static void shift(){

    }
    static void sort(int[] a){

    }
    static void locate(int[] a,int x){


    }
    static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    // swap elements
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
//        int[] a  ={23,46,2,68,26};

        int[] numbers = { 5, 9, 3, 2, 0 };
        System.out.println("Numbers before bubble sort: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Numbers after bubble sort: " + Arrays.toString(numbers));

    }
}
