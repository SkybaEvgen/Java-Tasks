// "abcde", "eabcd"-> true
// "bbcda", "dabbc"-> true
// "abcde", "edbac"-> false
// "ab", "ba" -> true
// "a","a" -> true
// "abc", "cab" -> true

public class StringCyclic {

    public boolean cyclic(String str1, String str2){
        if(str2.length() == 0 && str2.length() == 0) return true;
        if(str1.length() != str2.length()) return false;
        String tmp = str2;                  //в переменную tmp положили значение переменной str2
        for (int i = 0; i < str1.length(); i++) {
            tmp = tmp.charAt(tmp.length()-1) + tmp.substring(0, tmp.length()-1);
            if(tmp.equals(str2)) return true;
        }
        return false;
    }
}
