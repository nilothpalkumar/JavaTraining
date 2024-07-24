public class ReverseString {
    public static void main(String[] args) {

        String s = "HELLOW WORLD";

        String words[] = s.split("\\s");
        for (String w : words) {
            String reverseword = "";
            for (int i = 0; i < w.length(); i++) {
                char x = w.charAt(i);
                reverseword = x + reverseword;
            }
            System.out.print(reverseword+" ");
        }
    }
}