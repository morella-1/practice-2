abstract class S{
public static void main(String[] args) {
        Shape r = new Circle(2);
        System.out.println("半径为2的圆的面积是" + r.getArea());
        r = new Rectangle(3, 4);
        System.out.println("长为3，宽为4的长方形的面积为" + r.getArea());
        r = new Square(5);
        System.out.println("边长为5的正方形的面积为" + r.getArea());
        }
        }