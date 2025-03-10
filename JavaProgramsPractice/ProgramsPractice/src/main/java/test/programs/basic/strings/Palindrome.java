package test.programs.basic.strings;

/*
    Class Details:
    Name of the class: Palindrome
 */
public class Palindrome {

    /*
    Method Details:
    name of the method: isPalindrome
    input parameter: str
    DataType of input parameter: String
    So I will be calling this method with String input like "madam".
    return Type: boolean
     */
    boolean isPalindrome(String str){
        //creating a boolean variable to make sure that given string is palindrome or not , intitialized to false;
        boolean checkPalindrome = false;
        String reverse = reverseString(str);
        //checking the string and rever setirng are equl or not.
        if(reverse.equalsIgnoreCase(str)){
            checkPalindrome = true;
        }
        return checkPalindrome;
    }



    String reverseString(String s){
        //creating a temporary String variable to store the reverse of string, initializing to ""(empty string).
        String rev = "";
        //creating a normal for loop with i intialized to length of string
        //checking i is greater than 0 and decrementing by 1.
        for(int i = s.length()-1; i>=0; i--){
            //taking the character at index i and appending it to rev.
            rev += s.charAt(i);
        }

        return rev;
    }


}
