package com.test.collection;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
	
	  public void A() throws IOException
	{
		
	}

}

class XYZ  extends TestException

{
	public void A() throws FileNotFoundException , EOFException
	{
		
	}
}
