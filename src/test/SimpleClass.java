package test;

public class SimpleClass {
	private String a = null;
	private String b = null;
	
	SimpleClass(String x, String y) {
		a = x;
		b = y;
	}
	
	public boolean compareStrings() {
		return a.equals(b);
	}
}
