package wallarea;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall();
        System.out.println("wall1 - width: " + wall1.getWidth() + ", height: " + wall1.getHeight() + ", area: " + wall1.getArea());

        Wall wall2 = new Wall(5,4);
        System.out.println("wall2 - width: " + wall2.getWidth() + ", height: " + wall2.getHeight() + ", area: " + wall2.getArea());

        Wall wall3 = new Wall(-1,5);
        System.out.println("wall3 - width: " + wall3.getWidth() + ", height: " + wall3.getHeight() + ", area: " + wall3.getArea());

    }

}
