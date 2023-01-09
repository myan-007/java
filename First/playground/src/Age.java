public class Age {

    public static void checkAge(int a) throws Below18Exception {

        if(a<18) throw new Below18Exception("You are Below 18!");

    }

    public static void main(String[] args)  {
        try{
            checkAge(15);
        }
        catch (Below18Exception e){
            System.out.println(""+e.getMessage());
        }
    }
}
