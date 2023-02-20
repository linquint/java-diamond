import java.util.Scanner;

public class Main {
    public static void draw(int rows, int row) {
        int paintWidth = (row < rows / 2.0) ? (1 + row * 2) : (1 + (rows - 1 - row) * 2);
        int spaces = (int) Math.floor((rows - paintWidth) / 2.0);
        drawCell(spaces, paintWidth);
        System.out.println();
        if (row < rows - 1) draw(rows, row + 1);
    }
    public static void drawCell(int spaces, int paint) {
        if (spaces == 0 && paint == 0) return;
        if (spaces > 0) {
            System.out.print(" ");
            drawCell(spaces - 1, paint);
        } else {
            System.out.print("*");
            drawCell(spaces, paint - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = scanner.nextInt();
        draw(rows, 0);
    }
}