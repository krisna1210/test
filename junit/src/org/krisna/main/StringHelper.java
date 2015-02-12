package org.krisna.main;

public class StringHelper {
	public String truncateA(String val) {
	if(val.length()<=2)
		return val.replaceAll("A", "");
	
	String first2Chars = val.substring(0,2);
	String remainingChars = val.substring(2);
	return first2Chars.replaceAll("A", "")+""+remainingChars;
	
	}
	
	public boolean FirstAndLast(String val) {
		if(val.length()<=1)
			return false;
		if(val.length()==2)
			return true;

		String FirstTwo = val.substring(0, 2);
		String lastTwo = val.substring(val.length()-2);
		return  FirstTwo.equals(lastTwo);
		
	}

}
