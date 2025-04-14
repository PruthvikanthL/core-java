public class WordCount {
    public static void main(String[] args) {
        String sentence = "I am learning Java programming";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
