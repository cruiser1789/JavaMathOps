package MathOperations;

import java.math.BigDecimal;
import java.util.Objects;

public class Calculator implements ICalculator{
private Number result;

    public Number calculate(Operation op, Number
            num1, Number num2) {
        String typeErrorMessage = "Unsupported number types";
        switch (op) {
            case ADD: {
                try {
                    setResult(new BigDecimal(num1.toString()).add(new BigDecimal(num2.toString())));

                } catch (Exception e) {
                    throw new IllegalArgumentException(typeErrorMessage);
                }
                break;
            }
            case SUBTRACT: {
                try {
                    setResult(new BigDecimal(num1.toString()).subtract(new BigDecimal(num2.toString())));
                } catch (Exception e) {
                    throw new IllegalArgumentException(typeErrorMessage);
                }
                break;
            }
            case MULTIPLY: {
                try {
                    setResult(new BigDecimal(num1.toString()).multiply(new BigDecimal(num2.toString())));
                } catch (Exception e) {
                    throw new IllegalArgumentException(typeErrorMessage);
                }
            }
            case DIVIDE: {
                try {
                    setResult(new BigDecimal(num1.toString()).divide(new BigDecimal(num2.toString())));
                } catch (Exception e) {
                    throw new IllegalArgumentException(typeErrorMessage);
                }
            }
        }
        return getResult();
    }


    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    @Override
    public Calculator add(Number input) {
        setResult(  new BigDecimal(this.getResult().toString()).add(new BigDecimal(input.toString())));
        return this;
    }


    @Override
    public Calculator sub(Number a) {
         setResult(new BigDecimal(this.getResult().toString()).subtract(new BigDecimal(a.toString())));
        return this;
    }

    @Override
    public Calculator mul(Number a) {
        setResult(  new BigDecimal(this.getResult().toString()).multiply(new BigDecimal(a.toString())));
        return this;
    }

    @Override
    public Calculator div(Number a) {
        if(!Objects.equals(a.toString(), "0"))
            setResult(new BigDecimal(this.getResult().toString()).divide(new BigDecimal(a.toString())));
        return this;
    }

}
