package com.test.shivanshu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class TestSerialzation {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassCastException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, ClassCastException {
		Game game;
		try{
		
		//game = new Game(new Scanner(System.in).next(), Integer.valueOf(new Scanner(System.in).next()), System.currentTimeMillis());
		game = new Game("Shilpa", 143 , System.currentTimeMillis());
		}
		finally{
			
		}
		System.out.println("Before Serialize " + game.getS() + " " + game.getI() + " " + game.getD() );
		Game.serialize(game);
		
		Game game_deserialize = Game.deserialize();
		System.out.println("After Deserialize " + game_deserialize.getS() + " " + game_deserialize.getI() + " " + game_deserialize.getD() );

}
	

	}

class Game implements Serializable{
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public long getD() {
		return d;
	}

	public void setD(long d) {
		this.d = d;
	}

	private String s;
	private int i;
	private transient long d;
	public GamePlayer gp = new GamePlayer(); // It will only work when the class Game Player is also Serializablew
	public Game(String string, Integer num, long current_time) {
		this.s =string;
		this.i = num;
		this.d= current_time;
		
	}
	
	public Game(){
		
	}
	
	
	public static void serialize(Game game) throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shivanshu\\Desktop\\testSer.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(game);
		os.flush();
		os.close();
		
	}
	
	public static Game deserialize() throws IOException,ClassNotFoundException,ClassCastException{
		Game game;
		FileInputStream fis = new FileInputStream("C:\\Users\\Shivanshu\\Desktop\\testSer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		game = (Game) ois.readObject();		
		
		return game;
	}
}

class GamePlayer implements Serializable{
int fuss = 5;
}
