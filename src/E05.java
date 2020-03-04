import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double rows = Math.floor((h - 1.0) / 0.7);
        double colums = Math.floor(w / 1.2);
        System.out.printf("%.0f", rows * colums - 3);

    }
}
