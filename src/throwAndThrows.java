public class throwAndThrows {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("结果是：" + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获到异常：" + e.getMessage());
        }
    }
    public static int divide(int a,int b)throws ArithmeticException{
//        if(b==0) {
//            throw new ArithmeticException("除数不为0");
//        }
        return a/b;
    }
}