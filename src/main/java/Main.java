import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number of days...");
        int days = scanner.nextInt();
        System.out.println("enter price of each day...");
        String[] input;
        int[] prices = new int[days];
        for (int i = 0; i < days; i++) {
            prices[i] = scanner.nextInt();
        }
        int benefit = 0;
        for (int i = 0; i < days; i++) {
            for (int j = i; j < days; j++) {
                if (prices[j] - prices[i] > benefit) benefit = prices[j] - prices[i];
            }
        }

        System.out.println("best benefit can be " + benefit);
    }
}
