import java.util.Scanner;

public class Operation {

    public void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an operation, in the format (number sign number):");
        float num1 = scanner.nextFloat();
        char op = scanner.next().charAt(0);
        float num2 = scanner.nextFloat();
        scanner.close();
        float result = setOp(op, num1, num2);
        System.out.println(result);
    }

    public float sum(float num1, float num2){
        return num1 + num2;
    }
    public float subtraction(float num1, float num2){
        return num1 - num2;
    }
    public float multiplication(float num1, float num2){
        return num1 * num2;
    }
    public float division(float num1, float num2){
        if (num2 == 0){
            return 0;
        }
        else{
            return num1 / num2;
        }
    }


    public float setOp(char op, float num1, float num2){
        return switch (op) {
            case '+' -> sum(num1, num2);
            case '-' -> subtraction(num1, num2);
            case '*' -> multiplication(num1, num2);
            case '/' -> division(num1, num2);
            default -> 0;
        };
    }
}
