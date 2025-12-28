public class LazyParser {
    public void methodA() throws ArithmeticException{
        int res = 10/0;
        System.out.println(res);
    }
    public void methodB(){
        int res = 10/100;
        System.out.println(res);
    }
    public static void main(String[] args) {
        LazyParser parser = new LazyParser();
        try{
            parser.methodA();
            parser.methodB();
        }
        catch (ArithmeticException obj){
            System.out.println(obj.getMessage());
        }
    }
}
