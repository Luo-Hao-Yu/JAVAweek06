public class InterfaceDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        circle.Type();
        System.out.println("面积："+circle.getArea());
        System.out.println("周长："+circle.getPerimeter());

        Shape rectangle = new Rectangle(10,7);
        rectangle.Type();
        System.out.println("面积："+rectangle.getArea());
        System.out.println("周长："+rectangle.getPerimeter());
    }
}