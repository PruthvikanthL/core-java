public class FindWord {
    public static void main(String[] args) {
        String sentence = "I am learning Java programming";
        String target = "Java";

        if (sentence.contains(target)) {
            System.out.println("Target word is present.");
        } else {
            System.out.println("Target word is not present.");
        }
    }
}
