package calculator;

public class HelloWorld {

	@test
	public void subsequentNumber() {
	}
}


@test

public void subsequentNumber() {
	NumberRsngeCounter counter = new NumberRangeCounter();
	
	int first = counter.next();
	int second = counter.next();
	
	assertEquals(first +1,second)
}