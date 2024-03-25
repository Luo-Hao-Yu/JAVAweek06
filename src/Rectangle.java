// 矩形的面积及周长
public class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public void Type(){
        System.out.println("图形类型：矩形");
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }
}