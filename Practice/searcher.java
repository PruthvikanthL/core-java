import java.util.Scanner;

class searcher {
    public static void Search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the index value you're searching for:");
        int pos = sc.nextInt();

        Branch.searcher(pos);
    }
}
