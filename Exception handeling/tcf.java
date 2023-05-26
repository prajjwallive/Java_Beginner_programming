public class tcf {
    public static void main(String args[]){
        System.out.println("We are learning the work of try, catch and finally block");
        try{
           int  a = 10;
           System.out.println("There is no Syntax Error in this command"+a);
        }
        catch(ArithmeticException o){
            System.out.println("Error is generated:\n"+ o);
        }
        finally{
            System.out.println("This block of code will be executed either error is generated or not\b");
        }
    }
}
