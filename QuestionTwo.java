/**
 * @author Collins & Emeka
 *
 */
public class QuestionTwo {

	 public void reverseEveryWord(String str)
	   {
		String[] words = str.split(" "); //Split string into several strings
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			reverseWord = reverseWord + word.charAt(j); //charAt() to return character at j
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
	 
	   public static void main(String[] args) 
	   {
		QuestionTwo str = new QuestionTwo();
		str.reverseEveryWord("Reverse the word of this string");
		}

}
