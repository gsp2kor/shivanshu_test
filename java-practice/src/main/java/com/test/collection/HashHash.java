package com.test.collection;


public class HashHash {
	public int x;

	HashHash(int xVal) {
		x = xVal;
	}

	public boolean equals(Object o) {
		if (o instanceof HashHash && (((HashHash) o)).x == this.x) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return (x * 17);
	}
}
