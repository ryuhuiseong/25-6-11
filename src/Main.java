import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.println("1. 멜론소다 (1500원)");
        System.out.println("2. 초코우유 (1200원)");
        System.out.println("3. 딸기우유 (1200원)");
        System.out.println("4. 사이다 (800원)");

        int choice = scanner.nextInt();
        int price = 0;
        String item = "0";
        switch (choice) {
            case 1:
                item = "멜론소다";
                price = 1500;
                break;

            case 2:
                item = "초코우유";
                price = 1200;
                break;

            case 3:
                item = "딸기우유";
                price = 1200;
                break;

            case 4:
                item = "사이다";
                price = 800;
                break;

            default:
                System.out.println("잘못된 선택입니다.");
                return;

        }

        System.out.println(item);
        System.out.println(price);

    }
}