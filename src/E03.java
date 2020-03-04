import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());
        double farenhaid = celsius * 9/ 5 + 32;
        System.out.printf("%.2f", farenhaid);
    }
}
