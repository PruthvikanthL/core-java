public class CountCharacterO {
    public static void main(String[] args) {
        String sentence = "How often do you go to school on foot?";
        char target = 'o';
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Number of 'o' characters: " + count);
    }
}
