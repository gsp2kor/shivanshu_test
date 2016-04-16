package com.test.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TestNIO {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		 RandomAccessFile aFile = new RandomAccessFile(".resources/datanio-data.txt", "rw");
//		    FileChannel inChannel = aFile.getChannel();
//
//		    ByteBuffer buf = ByteBuffer.allocate(48);
//
//		    int bytesRead = inChannel.read(buf);
//		    while (bytesRead != -1) {
//
//		      System.out.println("Read " + bytesRead);
//		      buf.flip();
//
//		      while(buf.hasRemaining()){
//		          System.out.print((char) buf.get());
//		      }
//
//		      buf.clear();
//		      bytesRead = inChannel.read(buf);
//		    }
//		    aFile.close();
		
		//============================================================================
		
		RandomAccessFile fromFile = new RandomAccessFile("./resources/fromFile.txt", "rw");
		FileChannel      fromChannel = fromFile.getChannel();

		RandomAccessFile toFile = new RandomAccessFile("./resources/toFile.txt", "rw");
		FileChannel      toChannel = toFile.getChannel();

		long position = 0;
		long count    = fromChannel.size();

		toChannel.transferFrom(fromChannel, position, count);
		toFile.close();
		fromFile.close();
		
		//============================================================================
		


	}

}
