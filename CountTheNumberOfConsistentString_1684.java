//You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
//Return the number of consistent strings in the array words.

//Example 1:
//        Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//        Output: 2
//        Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

//Example 2:
//        Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
//        Output: 7
//        Explanation: All strings are consistent.

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentString_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
       Set<Character> allowedSet = new HashSet<>();
       for(char c : allowed.toCharArray()){
           allowedSet.add(c);
       }

       int count = 0;

       for (String word : words){
           Boolean isValid = true;
           for(char c : word.toCharArray()){
               if(!allowedSet.contains(c)){
                   isValid = false;
                   break;
               }
           }
           if(isValid){
               count++;
           }
       }

       return count;
    }
}
