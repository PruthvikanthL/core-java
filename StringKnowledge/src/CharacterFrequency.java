public class CharacterFrequency {
    public static void main(String[] args) {
        String sentence = "Java programming";
        char[] chars = sentence.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            if (chars[i] != ' ') {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        chars[j] = ' ';
                    }
                }
                System.out.println(chars[i] + ": " + count);
            }
        }
    }
}
