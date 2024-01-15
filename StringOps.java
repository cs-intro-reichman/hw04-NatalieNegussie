public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
		String newStr = "";
        int size = string.length();
		for(int i=0; i<size; i++){
			if((string.charAt(i) == 'a')||(string.charAt(i) == 'e')||(string.charAt(i) == 'o')||(string.charAt(i) == 'u')||(string.charAt(i) == 'i')){
					newStr = newStr + (string.charAt(i) - 32);
			}
			else if ((string.charAt(i)>= 65)&&(string.charAt(i)<= 90)){
				newStr = newStr + (string.charAt(i) + 32);	
			}
			else if (string.charAt(i)>= ' '){
				newStr = newStr + (string.charAt(i));
			}	
		}	
        return newStr;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
