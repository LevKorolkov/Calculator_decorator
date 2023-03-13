public class InstCalculator implements Ints{
    protected final Calculator target;

    public InstCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.SUM);

        double result = formula.result();
        return (int) result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.MULT);

        double result = formula.result();
        return (int) result;
    }

    @Override
    public int pow(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.POW);

        double result = formula.result();
        return (int) result;
    }
}
