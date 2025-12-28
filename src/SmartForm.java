class AgeException extends Exception{
    int errorCode;
    public AgeException(String msg,int errorCode){
        super(msg);
        this.errorCode = errorCode;
    }

    public int getErrorCode(){
        return this.errorCode;
    }
}

class MobileNumberException extends Exception{
    int errorCode;
    public MobileNumberException(String msg,int errorCode){
        super(msg);
        this.errorCode = errorCode;
    }
    public int getErrorCode(){
        return this.errorCode;
    }
}

class EmailInvalidException extends Exception{
    int errorCode;
    public EmailInvalidException(String msg,int errorCode){
        super(msg);
        this.errorCode = errorCode;
    }
    public int getErrorCode(){
        return this.errorCode;
    }
}

public class SmartForm {

    public boolean isMobileNumber(String phone){
        if(phone.matches("[0-9]{10}"))
            return true;
        return false;
    }
    public boolean isEmail(String email){
        if(email.contains("@"))return true;
        return false;

    }
    public void formData(String ageStr,String mobileNumber,String email) throws AgeException,MobileNumberException,EmailInvalidException{
        int age = Integer.parseInt(ageStr);
        if(age<18){
           throw new AgeException("Age must be greater than 18",546);
        }
        if(!isMobileNumber(mobileNumber)){
           throw new MobileNumberException("Mobile number must be digits and exactly 10 digits",548);
        }
        if(!isEmail(email)){
           throw new EmailInvalidException("Email must contains @",550);
        }
        System.out.println("Form is Accepted!!!!");
    }
    public static void main(String[] args) {
        SmartForm form = new SmartForm();
        try{
            form.formData("19","9865784880","john@gmail.com");
        }
        catch (NumberFormatException obj){
            System.out.println(obj.getMessage());
        }
        catch (AgeException | MobileNumberException | EmailInvalidException  obj){
            System.out.println(obj.getMessage());
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
