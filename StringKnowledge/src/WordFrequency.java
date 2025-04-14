public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful";
        String[] words = sentence.trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            if (!words[i].equals("")) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = "";
                    }
                }
                System.out.println(words[i] + ": " + count);
            }
        }
    }
}
