public class NegativeNumberBan {
    public static void main(String[] args) {
        int number = -36;
        try {
            if(number < 0) {
                throw new ArithmeticException("No negatives!!!");
            }
            System.out.println(Math.sqrt(number));
        }
        catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }

    }
}
