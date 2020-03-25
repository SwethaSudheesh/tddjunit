package com.epam.tddjunit;

public class RemoveAA {

	public String remove(String string) {
		if(string.length()>0&&string.charAt(0)=='A')
		{
			if(string.length()>1&&string.charAt(1)=='A') 
				string=string.substring(2);
			else
				string=string.substring(1);
		}
		else if(string.length()>1&&string.charAt(1)=='A')
			string=string.substring(0,1)+string.substring(2);
		return string;
	}
}
