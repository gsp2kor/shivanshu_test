package com.test.builderPattern;;

public class ASCIIConverter extends TextConverter {
	ASCIIText asciiTextObj;
	void convertCharacter(char c){
			char asciiChar = new Character(c).charValue();
				//gets the ascii character
			asciiTextObj.append(asciiChar);
		
		
	}
	
	ASCIIText getResult(){
		return asciiTextObj;
	}

}
