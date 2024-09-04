package MathOperations;

interface ICalculator<T extends Number> {
    //Add given number type to the result
    ICalculator<T> add(T input);

    //Subtract given number type from the result
    ICalculator<T>  sub(T input);

    //Multiply given number type from the result
    ICalculator<T>  mul(T input);

    //Divide given number type from the result
    ICalculator<T>  div(T input);
}