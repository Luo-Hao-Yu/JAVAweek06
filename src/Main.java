public class Main {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }catch(AbstractMethodError e){
            System.out.println("发生算数异常："+e.getMessage());
        }finally {
            System.out.println("这个finally块，无论是否发生异常都会执行。");
        }
    }
}