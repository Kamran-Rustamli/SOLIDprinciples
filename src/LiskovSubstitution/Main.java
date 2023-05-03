package LiskovSubstitution;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculater rectangleArea = (int c, int d) -> a * b;
        System.out.println("RectangleArea: " + (rectangleArea.calculate(a, b)));

        Calculater squareArea = (int e, int f) -> a * a;
        System.out.println("SquareArea: " + (squareArea.calculate(a, a)));

    }
}
