public class App {
public static void main(String[]args){
    Square s = new Square(6);//площадь квадрата
    System.out.println("The area of the Squere is " + s.area());

    Rectangle r = new Rectangle(4,1.1);//площадь прямоугольника
    System.out.println("The area of the Rectangle is " + r.area());

}
}
