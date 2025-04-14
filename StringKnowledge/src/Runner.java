public class Runner{
    public static void main(String[] args) {
        String input = "Pruthvi";
        char[] chars = input.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
