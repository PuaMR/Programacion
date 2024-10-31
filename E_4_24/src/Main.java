import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = 696969;
        int a = scanner.nextInt();


        while (a != -1) {
            n = scanner.nextInt();
            if (n != -1) {
                System.out.println(n - a);
                a = n;
            } else if (n == -1) {
                break;
            }
        }
    }
}
