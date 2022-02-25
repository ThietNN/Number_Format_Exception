import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập y: ");
        int y =scanner.nextInt();
        CalculationExample calculation = new CalculationExample();
        calculation.calculate(x, y);
    }

    private void calculate(int x, int y){
        try {
            int add = x + y;
            int sub = x - y;
            int mul = x * y;
            int div = x / y;
            System.out.println("Tổng = " + add);
            System.out.println("Hiệu = " + sub);
            System.out.println("Tích = " + mul);
            System.out.println("Thương = " + div);
        }
        catch (Exception exception){
            System.err.println("Exception has occurred: " + exception.getMessage());
        }
    }
}
