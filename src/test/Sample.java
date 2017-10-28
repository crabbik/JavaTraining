package test;

abstract public class Sample {

	private String a;

	public Sample(String a) {
		this.setA(a);
	}

	public Sample() {
	}

	abstract void test();

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

}
