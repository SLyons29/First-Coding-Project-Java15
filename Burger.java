package com.cognixia.jump.corejava.BurgerSpot;

public class Burger {
	boolean hasBun;
	boolean hasMayo;
	boolean hasKetuchup;
	boolean hasMustard;
	boolean hasCheese;
	boolean hasPickles;
	boolean hasBeef;
	
	
	
	
	public Burger() {
		super();
		this.hasBun = false;
		this.hasMayo = false;
		this.hasKetuchup = false;
		this.hasMustard = false;
		this.hasCheese = false;
		this.hasPickles = false;
		this.hasBeef = false;
	}


	public Burger(boolean hasBun, boolean hasMayo, boolean hasKetuchup, boolean hasMustard, boolean hasCheese,
			boolean hasPickles, boolean hasBeef) {
		super();
		this.hasBun = hasBun;
		this.hasMayo = hasMayo;
		this.hasKetuchup = hasKetuchup;
		this.hasMustard = hasMustard;
		this.hasCheese = hasCheese;
		this.hasPickles = hasPickles;
		this.hasBeef = hasBeef;
	}




	@Override
	public String toString() {
		return "Burger [hasBun=" + hasBun + ", hasMayo=" + hasMayo + ", hasKetuchup=" + hasKetuchup + ", hasMustard="
				+ hasMustard + ", hasCheese=" + hasCheese + ", hasPickles=" + hasPickles + ", hasBeef=" + hasBeef + "]";
	}

	
}
