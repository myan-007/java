public class WhileLoop {

    public static void main(String[] args){
        int a ;
        a = InputReader.readInt("Enter the number :");
        int number =a;
        int temp = a;
        int reverse=0;
        int i=0;

        while(a!=0){
            i++;
            a/=10;
        }
        i--;
        while(number!=0){
            reverse+=(number%10)*(Math.pow(10,i));
            i--;
            number/=10;
        }
        System.out.println("Reverse of " + temp + " is " + reverse);
    }
}
