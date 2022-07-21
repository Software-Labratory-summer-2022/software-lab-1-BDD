package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private String operator;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+), one operator ([\\^*/])$")
    public void twoInputValuesAndOneOperator(int arg0, int arg1, String arg2) {
        value1 = arg0;
        value2 = arg1;
        operator = arg2;
    }

    @When("^I operate on the two values$")
    public void iOperateOnTheTwoValues() {
        result = calculator.calculate(value1, value2, operator);
        System.out.print(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
