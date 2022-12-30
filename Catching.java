class Catching{
    static void test() throws ArithmeticException {
        throw new ArithmeticException("sasa");
    }
    public static void main(String[] args){
       
        try{
            // int divideByZero = 5/0;
            test();
            System.out.println("Rest of the code is try block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException =>"+e.getMessage());
            //  throw new ArithmeticException("Divided by 0");
        }

        System.out.println("meowwww");
    }
}