public class Select extends Operation{
    public float num1;
    public float num2;
    public float op;
    public Select(char op, float num1, float num2){
        this.op = op;
        this.num1 = num1;
        this.num2 = num2;
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
