public class Main {
    public static void main(String[] args) {
        System.out.println("init class Point");
        Point point = new Point(15, 15);
        System.out.println(point.toString());

        System.out.println("\nset XY class Point");
        point.setXY(10,20);
        System.out.println(point.toString());

        System.out.println("\ninit class MoveablePoint with variable moveablePoint");
        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(), 10, 20);
        System.out.println(moveablePoint.toString());
        System.out.println("\ninit method move()");
        moveablePoint.move();
        System.out.println(moveablePoint.toString());

        System.out.println("\ninit class MoveablePoint with variable speedPoint");
        MoveablePoint speedPoint = new MoveablePoint(20,20);
        System.out.println(speedPoint.toString());
        System.out.println("\ninit method move()");
        speedPoint.move();
        System.out.println(speedPoint.toString());
    }
}
