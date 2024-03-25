public class MyExtension extends Exception {
    private int errorCode;
    public MyExtension(String message,int errorCode){
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode(){
        return errorCode;
    }
}
