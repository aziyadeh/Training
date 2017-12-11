package aspire.training.lesson1;


import junit.framework.Assert;

public class AspireString {

	
	private String value;

	public AspireString(String value) {
		this.value = value;
	}
	
	
	public AspireString checker(AspireStringPredicate predicate) {
		
		Assert.assertEquals(true, predicate.test(value));
		
		return this;
	}
}
