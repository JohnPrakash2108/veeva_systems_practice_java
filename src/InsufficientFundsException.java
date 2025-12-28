public class InsufficientFundsException extends Exception{
    private int errorCode;

    public InsufficientFundsException(String msg,int errorCode){
        super(msg);
        this.errorCode=errorCode;
    }

    public int getErrorCode(){
        return this.errorCode;
    }
}
