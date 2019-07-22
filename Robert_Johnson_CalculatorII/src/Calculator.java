import java.util.ArrayList;

public class Calculator {
    private double result;
    private ArrayList<Double> operands = new ArrayList<Double>();
    private ArrayList<String> operators = new ArrayList<String>();

    public void performOperations(double operand) {
        operands.add(operand);
    }

    public void performOperations(String operator) {
        if (operator.equals("=")) {
            calculateOperations();
        } else {
            operators.add(operator);
        }
    }

    public void getResults() {
        System.out.println(operands);
        System.out.println(operators);
    }

    public void calculateOperations() {
        System.out.println(this.operands);
        System.out.println(this.operators);
        for(int i = 0; i < this.operators.size(); i++) {
            if (this.operators.get(i).equals("*")) {
                result = this.operands.get(i) * this.operands.get(i + 1);
                this.operands.set(i, result);
                this.operands.remove(i + 1);
                this.operators.remove(i);
                i--;
                System.out.println(this.operands);
                System.out.println(this.operators);
            }
            else if (this.operators.get(i).equals("/")) {
                result = this.operands.get(i) / this.operands.get(i + 1);
                this.operands.set(i, result);
                this.operands.remove(i + 1);
                this.operators.remove(i);
                i--;
                System.out.println(this.operands);
                System.out.println(this.operators);
            }
        }
        for(int i = 0; i < this.operators.size(); i++) {
            if (this.operators.get(i).equals("+")) {
                result = this.operands.get(i) + this.operands.get(i + 1);
                this.operands.set(i, result);
                this.operands.remove(i + 1);
                this.operators.remove(i);
                i--;
                System.out.println(this.operands);
                System.out.println(this.operators);
            }
            else if (this.operators.get(i).equals("-")) {
                result = this.operands.get(i) - this.operands.get(i + 1);
                this.operands.set(i, result);
                this.operands.remove(i + 1);
                this.operators.remove(i);
                i--;
                System.out.println(this.operands);
                System.out.println(this.operators);
            }
        }
    }
}