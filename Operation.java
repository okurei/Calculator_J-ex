import java.util.Scanner;

public class Operation{
    private float num1;
    private float num2;
    private float result;
    private String op;
    Scanner scan = new Scanner(System.in);

    private void scanIn() {
        System.out.println("Insert operation with the format: Number Sign Number");
            String input = scan.nextLine();
            String[] tmp = input.split(" ");
            try {
                num1 = Integer.parseInt(tmp[0]);
                num2 = Integer.parseInt(tmp[2]);
                op = tmp[1];
            } catch (Exception e) {
                System.out.println("Invalid Input ");
                scanIn();
            }
    }
    private float div(){
        float tmp;
        if (num2 == 0){
            tmp = num2;
        }else { tmp = num1 / num2;}
        return tmp;
    }
    public void operation(){
        scanIn();
        switch (op){
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = div();
            default -> scanIn();
        }
        System.out.println(result);
    }
}