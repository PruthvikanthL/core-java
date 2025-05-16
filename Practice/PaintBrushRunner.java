public class PaintBrushRunner {
    public static void main(String[] args) {
        PaintBrush brush1 = new PaintBrush("Winsor & Newton","Round","Natural Hair",25,10,false,true,true,"Wood",
		"Black",true,false,true,false,5,"Canvas,Paper",false,12.99,"UK");
        brush1.display();
		PaintBrush brush2 = new PaintBrush("Princeton","Flat","Synthetic",30,15,true,true,true,"Plastic","Blue",
		false,true,false,true,4,"Canvas, Wood",false,9.99,"USA");
        brush2.display();
		PaintBrush brush3 = new PaintBrush("Da Vinci", "Fan", "Natural Bristle", 20, 12,false, true, false, 
		"Bamboo", "Brown",true,true,false,false,6,"Canvas, Paper, Fabric",true,15.49,"Germany");
        brush3.display();
    }
}
