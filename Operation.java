public class Operation extends Main{
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
}