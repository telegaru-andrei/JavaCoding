import Task1.Calculator;

public class Main {
    public static void main(String[] args){

        Calculator calculator = new Calculator(5, 10);
        calculator.setTermenUnu(2.3f);
        calculator.setTermenDoi(5f);

        System.out.println(calculator.adunare());
    }
}