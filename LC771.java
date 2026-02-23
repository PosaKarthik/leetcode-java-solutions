import java.util.HashMap;

public class LC771{
    public static void main(String[] args){

     //Problem - 771

//      You're given strings jewels representing the types of stones that are jewels, 
// and stones representing the stones you have. Each character in stones is a type of stone you have. 
// You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Example 1:

 String jewels = "aA";
 String stones = "aAAbbbb";
// Output: 3
// Example 2:

// Input: jewels = "z", stones = "ZZ"
// Output: 0
 

// Constraints:

// 1 <= jewels.length, stones.length <= 50
// jewels and stones consist of only English letters.
// All the characters of jewels are unique.


//--->Solution

//----->BruteForce

int answer = 0;

    for(int i=0;i<stones.length();i++){
        char stonesCharacter = stones.charAt(i);
        for(int j=0;j<jewels.length();j++){
            char jewelsCharacter = jewels.charAt(j);

            if(stonesCharacter == jewelsCharacter){

              answer++;

            }
        }
    }

        System.out.println("Answer : "+answer);



        //Optimized

        String jewels2 = "aA";
 String stones2 = "aAAbbbb";

int answer2 = 0;

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(int i=0;i<stones2.length();i++){
            char stonesChar = stones2.charAt(i);
            hashMap.put(stonesChar,hashMap.getOrDefault(stonesChar,0)+1);
        
        }
        for(char ch : hashMap.keySet()){
            for(int i=0;i<jewels2.length();i++){
            if(ch == jewels2.charAt(i)){
                answer2+=hashMap.get(ch);
            }
        }
            }
        System.out.println("Answer2  : "+answer2);
        
    }
}