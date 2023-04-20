import org.junit.Test;
import calc.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {

    //red, green refactor

    @Test
    public void addTest() {
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 + val2;
        //When
        int actual = calculator.add(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
        System.out.println(expected);
    }

    @Test
    public void subtractTest() {

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 - val2;
        int actual = calculator.subtract(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
        System.out.println(expected);

    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        int val1 = 15;
        int val2 = 15;
        int expected = val1 * val2;
        int actual = calculator.multiply(val1, val2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        int val1 = 10;
        int val2 = 5;
        int expected = val1 / val2;
        int actual = calculator.divide(val1, val2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareTest() {
        Calculator calculator = new Calculator();
        int val1 = 10;
        int expected = val1 * val1;
        int actual = calculator.square(val1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareRootTest() {
        Calculator calculator = new Calculator();
        int val1 = 10;
        int expected = (int) Math.sqrt(val1);
        int actual = calculator.squareRoot(val1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void exponentTest() {
        Calculator calculator = new Calculator();
        int val1 = 10;
        int expected = (int) Math.exp(val1);
        int actual = calculator.exponent(val1);
        Assert.assertEquals(expected, actual);
    }

}


