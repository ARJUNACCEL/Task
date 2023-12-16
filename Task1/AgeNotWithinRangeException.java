public class AgeNotWithinRangeException extends Exception{
     private String message;


    public  AgeNotWithinRangeException(String message){

       this.message= message;
    }
    public String getMessage(){
         return message;
    }
}
