// 圆的面积及周长
public class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void Type(){
        System.out.println("图形类型：圆");
    }
    @Override
    public double getArea() {
        return Math.PI* radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
