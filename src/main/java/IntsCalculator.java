public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calculator(Calculator.Operation.SUM, target.newFormula(), arg0, arg1);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calculator(Calculator.Operation.MULT, target.newFormula(), arg0, arg1);
    }

    @Override
    public int pow(int a, int b) {
        return calculator(Calculator.Operation.POW, target.newFormula(), a, b);
    }

    public int calculator(Calculator.Operation type, Calculator.Formula operation, int arg0, int arg1) {
        operation = target.newFormula();
        operation.addOperand(Double.valueOf(arg0));
        operation.addOperand(Double.valueOf(arg1));
        return (int) operation.calculate(type).result();
    }
}
