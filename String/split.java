import java.util.*;

class split {
    public static void main(String[] args) {
        String s = "Hello How are you";
        ArrayList<String> list = new ArrayList<>();
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!word.isEmpty()) {
                    list.add(word);
                    word = "";
                }
            } else {
                word += s.charAt(i);
            }
        }

        System.out.println(list);
    }
}