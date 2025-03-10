package test.programs.basic.strings;

public class WordsLength {

    String[] printWords(String str){
        String[] words = str.split(" "); //It will split based on spaces and store in an array of strings.
        //words = {"I", "am"}; 2
        String[] evenWords = new String[words.length]; //creating an array with length of Strings. 6 size
        //evenWords = new String[2];
        int index = 0;
        for(String word: words){
            if(word.length() % 2 == 0){
                evenWords[index++] = word;
            }
        }
        //ArrayLists: dynamic arrays.

        return evenWords; //{"am", null}
    }

/*
    byte printWords(String s){
        for(String a : s.split(" ")){
            if(a.length() % 2 == 0){
             //   System.out.println(a);

            }
        }
    }
*/


}
