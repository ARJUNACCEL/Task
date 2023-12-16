public class NameNotValidException extends Exception{
    private String message;
    public NameNotValidException(String message){
        this.message=message;
    }

    public String getMessage() {

        return message;
    }
}
