# JavaMathOps
trying out a sample Program for Simple Math Ops with Chaining 

Sample way to try out operations is as follows:
 Calculator calc = new Calculator();
        // Add 2 Numbers
        Number calculatedOne = calc.calculate(Operation.ADD, 12, 5);
        System.out.println(calculatedOne);
         // Chaining Operations of Math Op Methods
        System.out.println(calc.add(10).mul(2).getResult());
     
