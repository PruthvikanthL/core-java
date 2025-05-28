import java.util.Scanner;
class switch_cond{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
       System.out.println("Hey hi welcome to the food suggestion Media just give the tempereture i will suggest the good food \n here Temp -->\n 1.0,5,10--> Freezing\n2.11,15,20-->cool\n 3.21,25-->pleasant \n 4.26,30-->warm \n 5.31,35,40-->Hot");
		int temp = sc.nextInt();
		switch (temp) {
            case 0:
                System.out.println("It's freezing! Enjoy hot soup or a bowl of ramen.");
                break;
            case 5:
                System.out.println("It's very cold! Have some hot chocolate or a spicy curry.");
                break;
            case 10:
                System.out.println("It's chilly! A cup of masala chai with pakoras would be perfect.");
                break;
            case 15:
                System.out.println("Cool weather! Try some grilled sandwiches or a warm latte.");
                break;
            case 20:
                System.out.println("It's a bit cool! Enjoy a cup of coffee with some roadside snacks.");
                break;
            case 22:
                System.out.println("Pleasant weather! Spicy street food like momos or chaat would be great.");
                break;
            case 25:
                System.out.println("Mildly warm! Try some fresh juice or a refreshing smoothie.");
                break;
            case 30:
                System.out.println("Getting warm! A cold lassi or iced tea would be refreshing.");
                break;
            case 35:
                System.out.println("Hot outside! Drink coconut water and eat light salads.");
                break;
            case 40:
                System.out.println("Scorching heat! Stay cool with watermelon, lemon juice, or ice cream.");
                break;
            default:
                System.out.println("Temperature out of range! Stay comfortable and eat what you love.");
		}
	}


}



	