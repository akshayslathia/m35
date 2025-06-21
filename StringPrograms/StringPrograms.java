package arrayPrograms;

import java.util.Stack;

public class StringPrograms {

	
	public static int countNoOfVowels(String s)
	{
		int count = 0;
		
		// using normal loop
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c=='a' ||c=='e' ||c=='i' || c=='o' || c=='u')
				count++;
		}
		
		
		// using for each loop
//		for(char c : s.toCharArray())
//		{
//			if(c=='a' || c=='e' ||c=='i' || c=='o' || c=='u')
//				count++;
//		}
		
		return count;
	}
	
	// count uppercase and lowercase characters
	public static int[] countUpperLower(String s) {
		
		int countUpper = 0,countLower = 0;
		
		for(char c : s.toCharArray())
		{
			if(c>='A'  && c<='Z')
				countUpper++;
			else
				countLower++;
		}
		
//		System.out.println("Upper case :"+countUpper);
//		System.out.println("Lower case :"+countLower);
		
		int[] a = {countUpper,countLower};
		
		
		return a;
	}
	
	public static int countNoOfWords(String s)
	{
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if((i==0 && s.charAt(i)!=' ') ||  ( s.charAt(i)!=' ' && s.charAt(i-1)==' '))
				count++;
		}
		
		return count;
	}
	
	public static String reverse1(String s)
	{
		String res = "";
		for(int i=s.length()-1;i>=0;i--)
			res = res + s.charAt(i);
		
		return res;
			
	}
	
	public static String reverse2(String s)
	{
		String res = "";
		for(int i=0;i<s.length();i++)
			res = s.charAt(i) +res;
		
		return res;
			
	}
	
	public static String reverse3(String s)
	{
		char[] c = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(start<end)
		{
			//x --> c[start]
			// y---> c[end]
			
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			
			
			start++;
			end--;
		}
		
		return new String(c);
	}
	
	public static String reverse4(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		
		sb.reverse();
		
		return sb.toString();
	}
	
	public static String reverse5(String s)
	{
		char[] c = s.toCharArray();
		
		int start = 0;
		int end = s.length()-1;
		
		while(start<end)
		{
			//x --> c[start]
			// y---> c[end]
			
			
			c[start] = (char)(c[start] ^ c[end]);
			c[end] = (char)(c[start] ^ c[end]);
			c[start] = (char)(c[start] ^ c[end]);
			
			
			start++;
			end--;
		}
		
		return new String(c);
	}
	
	public static String removeDuplicatesFromString(String s)
	{
		char[] c = s.toCharArray();
		int count = 0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
			{
				for(int j=i+1;j<c.length;j++)
				{
					if(c[j]!='@' && c[i]==c[j])
					{
						c[j]='@';
						count++;
					}
				}
			}
		}
		
		char[] res = new char[c.length-count]; // creating a new array to store 
												// unique characters
		int k = 0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
				res[k++] = c[i];
		}
		
		return new String(res);
	}
	
	public static String reverse6(String s)
	{
		Stack<Character> st = new Stack<>();
		
		for(char c :s.toCharArray())
		{
			st.push(c);
		}
		
		String res = "";
		while(!st.isEmpty())
		{
			res = res + st.pop();
		}
		
		return res;
	}
	
	public static boolean checkPalindrome(String s)
	{
		String rev = reverse4(s);
		
		return rev.equalsIgnoreCase(s);
	}
	
	public static String toUpperCase(String s)
	{
		String res = "";
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='a' && c<='z')
			{
				int x  = (int)c; // convert to ASII value
				x = x -32; // subtract -32 from ASCII value
				c = (char)x; // convert back to character
				
				res = res + c; // concatinate to empty string
			}
			else
			{
				res = res + c; // concatinate to empty string
			}
			
		}
		
		return res;
		
	}
	
	
	
	
	// count no of digits in a String
	public static int countNoOfDigits(String s)
	{
		int count = 0;
		for(char c : s.toCharArray())
		{
			if(c>='0' && c<='9')
				count++;
		}
		
		return count;
	}
	
	// count no of uppercase , lowercase , digits , special characters
	public static int[] countUpperLowerDigitsSpecial(String s)
	{
		int countUpper = 0,countSpace = 0, countLower = 0 ,countDigit = 0 ,countSpecial = 0;
		
		for(char c : s.toCharArray())
		{
			if(c>='A' && c<='Z')
				countUpper++;
			else if(c>='a' && c<='z')
				countLower++;
			else if(c>='0' && c<='9')
				countDigit++;
			else if(c==' ')
				countSpace++;
			else 
				countSpecial++;
		}
		
		int[] res = {countUpper,countSpace,countLower,countDigit,countSpecial};
		
		return res;
	}
	
	public static String sortTheCharactersOfString(String s)
	{
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		
		return new String(c);
	}
	
	public static void frequencyOfCharacterInString(String s)
	{
		char[] c = s.toCharArray();
		int[] freq = new int[c.length];
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
			{
				freq[i] = 1;
				for(int j=i+1;j<c.length;j++)
				{
					if(c[j]!='@' && c[i]==c[j])
					{
						c[j] = '@';
						freq[i]++;
					}
				}
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='@')
			{
				System.out.println(c[i]+"---->"+freq[i]);
			}
		}
	}
	
	public static String largestPalidindrome(String s)
	{
		String[] split = s.split(" ");
		
		String largestPalindrome = "";
		
		for(String x : split)
		{
			if(checkPalindrome(x))
			{
				if(x.length()>largestPalindrome.length())
					largestPalindrome = x;
			}
		}
		
		return largestPalindrome;
	}
	
	
	public static int sumOfAlphaNumeric(String s)
	{
		int sum = 0;
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(Character.isDigit(c))
			{
				temp = temp + c;
			}
			else
			{
				if(!temp.isEmpty())
				{
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		
		if(!temp.isEmpty())
			sum = sum + Integer.parseInt(temp);
		
		return sum;
	}
	
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		
		String res1 = sortTheCharactersOfString(s1);
		String res2 = sortTheCharactersOfString(s2);
		
		return res1.equals(res2);
	}
	
	// calculate the length of String without using length() , and for each loop , array
	public static void countLengthOfString(String s)
	{
		// s = "java"
		int i = 0;
		int count = 0;
		while(true)
		{
			try
			{
				s.charAt(i);
				i++;
				count++;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Length of String :"+count);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		String s = "wow that madam knows malayalam";
		System.out.println(s);
		System.out.println(largestPalidindrome(s));
		
		
		
		
	
		
		
		
	}

}


