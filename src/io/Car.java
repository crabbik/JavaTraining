package io;

import java.io.Serializable;

public class Car implements Serializable {
	 private transient String brend ;
	 private static final long serialVersionUID =2l; 

	public Car(String brend) {
		super();
		this.brend = brend;
	}

	@Override
	public String toString() {
		return "Car [brend=" + brend + "]";
	}

}
