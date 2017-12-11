package aspire.training;

import aspire.training.lesson1.AspireString;
import aspire.training.lesson1.AspireStringPredicate;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestUsingLambda extends TestCase {
	private AspireString aspireString;

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public TestUsingLambda(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TestUsingLambda.class);
	}

	@Override
	protected void setUp() throws Exception {
		aspireString = new AspireString("Just for test [1234 ]");
	}

	public void testContains() {

		aspireString.checker(value->value.contains("Just for"));
	}
	
	public void testEqual() {

		aspireString.checker(value->value.equals("Just for test [1234 ]"));
	}
	
	public void testMatch() {

		aspireString.checker(value->value.matches(".*\\[\\d{4}.*"));
	}
}
