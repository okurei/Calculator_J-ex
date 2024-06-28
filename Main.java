import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an operation (number sign number):");
        float num1 = scanner.nextFloat();
        char op = scanner.next().charAt(0);
        float num2 = scanner.nextFloat();
        scanner.close();

        Select select = new Select(op, num1, num2);
        float result = select.setOp(op, num1, num2);
        System.out.println(result);
    }
}
