package com.test.accesscontrol1;

public class Solutions {



	public static void main(String[] args) {
		int x = -1;
		int y = -2;
		int steps = solution(x, y);
		System.out.println("Answer  "+ steps);
	}
	
	private static int solution(int x, int y) {

		Solutions stream = new Solutions();
		int countSteps = 0;
		
		while(loop){
			
			countSteps = stream.countSteps(x,y);
		}


		return countSteps;
	}

	int x = 0;
	int y = -1;
	static boolean loop =true;
	int nextTurn = 2;
	int countSoFar = 0;
	Dir1 direction = Dir1.UP;

	int spiral = -1;



	private enum Dir1 {
		UP(0, 1), RIGHT(1, 0), DOWN(0, -1), LEFT(-1, 0);

		int dx, dy;

		Dir1(int dx, int dy) {
			this.dx = dx;
			this.dy = dy;
		}

		Dir1 nextDirection() {
			int i = (ordinal() + 1) % values().length;
			return values()[i];
		}
	}

	public int countSteps(int x2, int y2) {
		if (countSoFar > nextTurn / 2) {
			nextTurn ++;
			countSoFar = 1;
			direction = direction.nextDirection();
		}
		countSoFar++;
		x += direction.dx;
		y += direction.dy;
		spiral ++;
		System.out.println(spiral + "--" +x+" "+y);
		if(x2==x && y2==y) loop=false;
		return spiral;
	}

}
