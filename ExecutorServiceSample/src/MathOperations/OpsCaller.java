package MathOperations;
// Main Class that initiates Calculator class and performs operations
public class OpsCaller {
    public static void main(String[] s){
        Calculator calc = new Calculator();
        // Add 2 Numbers
        Number calculatedOne = calc.calculate(Operation.ADD, 12, 5);
        System.out.println(calculatedOne);

        // Subtract a Number 2 from another

        Number calculatedTwo = calc.calculate(Operation.SUBTRACT, 12, 5);
        System.out.println(calculatedTwo);

        // Chaining Operations of Math Op Methods
        System.out.println(calc.add(10).mul(2).getResult());
    }
}
