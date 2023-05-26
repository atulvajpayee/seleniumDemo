import java.util.Hashtable;
import java.util.Locale;

public class charCount {
    public static void main(String[] args) {

System.out.println(        getCharCount("I Like most and love Java programing"));


    }

    public static Hashtable<Character, Integer> getCharCount(String str) {
        Hashtable<Character, Integer> hash = new Hashtable<>();
       str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (hash.containsKey(ch)) {

                    hash.put(ch, hash.get(ch) + 1);
                } else {
                    hash.put(ch, 1);
                }
            }
        }
        return hash;
    }


}
