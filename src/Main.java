public class Main {
    public static void main(String[] args) {
        Square square = new Square(6);

        /*System.out.println(square.bok);
        System.out.println(square.obw);
        System.out.println(square.pole);*/

        Square square2 = new Square(10);

        square2.setBok(8);

        System.out.println(square2.getBok());
        System.out.println(square2.getObw());
        System.out.println(square2.getPole());

        /*System.out.println("-------------------------");

        System.out.println(square2.bok);
        System.out.println(square2.obw);
        System.out.println(square2.pole);*/

    }
}
