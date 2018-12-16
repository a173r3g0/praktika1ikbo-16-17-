public class Player {

    public static void main(String [] args) {
        Ball ball1 = new Ball("Green", 10f);
        Ball ball2 = new Ball("Red", 5f);
        Ball ball3 = new Ball("Yellow", 15f);

        ball1.setRadius(1.5f);
        ball2.setColor("Blue");

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);

        ball1.toMetres();
        ball2.toMetres();
        ball3.toMetres();

    }
}
