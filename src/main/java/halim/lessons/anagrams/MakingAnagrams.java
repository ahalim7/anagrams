/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.anagrams;

/**
 *
 * @author AbdElHalim
 */
public class MakingAnagrams {
    
    public static void main(String[] args) {
            int res = makeAnagram("cde", "abcsss");
        System.out.println(res);
    }
    
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int count = 0; 
  
        // store the count of character 
        int char_count[] = new int[26]; 
  
        // iterate though the first String and update  
        // count 
        for (int i = 0; i < a.length(); i++)  
            char_count[a.charAt(i) - 'a']++;         
  
        for (int i = 0; i < b.length(); i++)
            char_count[b.charAt(i) - 'a']--;
        
        for(int i=0; i< char_count.length; i++){
            if(char_count[i] < 0 || char_count[i] > 0){
                count+= Math.abs(char_count[i]);
            }
        }
        return count; 
    }
}
