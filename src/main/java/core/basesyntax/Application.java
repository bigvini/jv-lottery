package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball b1 = new Lottery().getRandomBall();
        Ball b2 = new Lottery().getRandomBall();
        Ball b3 = new Lottery().getRandomBall();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
