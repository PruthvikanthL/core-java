import java.util.Scanner;
class Branchrunner{
	public static void main(String[] args){
		Branch.addbranch("AIML");
		Branch.addbranch("CSE");
		Branch.addbranch("IOT");
		System.out.println("Are you want search ...? please enter y ");
		Scanner sc=new Scanner(System.in);
		String T=sc.next();
		if (T=="y"){
			searcher.Search();
		}
	}
}