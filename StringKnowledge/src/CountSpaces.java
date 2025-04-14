public class CountSpaces {
    public static void main(String[] args) {
        String sentence = "I am learning Java programming";
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of spaces: " + count);
    }
}
