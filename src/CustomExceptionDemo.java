public class CustomExceptionDemo {
    public static void main(String[] args) {
        try{
            int result = divide(10,0);
            System.out.println("结果是："+result);
        }catch(MyExtension e){
            System.out.println("捕获到异常："+e.getMessage());
            System.out.println("错误代码："+e.getErrorCode());
        }
    }
    public static int divide(int a,int b)throws MyExtension{
        if(b==0){
            throw new MyExtension("除数不能为0", 11101);
    }
        return a/b;
    }
}
