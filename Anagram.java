import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        
        System.out.println(isAnagram("car", "rac"));

    }

public static boolean isAnagram(String s, String t){
    if(s.length() != t.length()) return false;
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();

    Arrays.sort(sArr);
    Arrays.sort(tArr);

    return Arrays.equals(sArr, tArr);

}


}

// #Dacoda's Notes:
// toCharArray will break down String to individual characters
// sort method will sort characters according to ASCII
