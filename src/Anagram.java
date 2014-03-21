//import java.util.*;

public class Anagram {
	
	public String sort(String s){
		char[] st = s.toCharArray();
		java.util.Arrays.sort(st);
		return new String(st);
	}
	
	public boolean permutation(String s, String t){
		if(s.length() != t.length())
			return false;
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram check = new Anagram();
		boolean trol = check.permutation("dog","god");
		System.out.println("" +trol);
	}

}
