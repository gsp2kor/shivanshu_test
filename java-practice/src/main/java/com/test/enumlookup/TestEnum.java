package com.test.enumlookup;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

 @SuppressWarnings("unchecked")
enum Direction{
	
	 EAST(0) , WEST(90), NORTH(180) , SOUTH(270);
	 
	 private int angle;
	 
	 private Direction(final int angle){
		 this.angle = angle;
	 }
	 
		public int getAngle() {
			return angle;
		}
	
	// Lookup table
		private static final Map lookup = new HashMap();

		// Populate the lookup table on loading time
		static {
			for (Direction s : EnumSet.allOf(Direction.class))
				lookup.put(s.getAngle(), s);
		}

		// This method can be used for reverse lookup purpose
		public static Direction get(int angle) {
			return (Direction) lookup.get(angle);
		}
}

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Angle lookup
				System.out.println(Direction.NORTH.getAngle());
				// Reverse lookup by angle
				System.out.println(Direction.get(90));

	}

}
