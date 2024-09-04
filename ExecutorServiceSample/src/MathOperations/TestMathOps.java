package MathOperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMathOps {

    private Calculator _calc;

    @BeforeEach
    void setUp() {
        _calc = new Calculator();
    }
    @Test
    void testAddNumbers() {
        _calc.calculate(Operation.ADD, 12.0, 10.0);
        assertEquals(22.0, _calc.getResult());
    }
    @Test
    void testAdd() {
        _calc.calculate(Operation.ADD, 12.0, 10.0);
        _calc.add(11.0);
        assertEquals(33.0, _calc.getResult());
    }

    @Test
    void testSub() {
        _calc.calculate(Operation.ADD, 10.0, 10.0);
        _calc.sub(11.0).add(5);
        assertEquals(14.0, _calc.getResult());
    }
}
