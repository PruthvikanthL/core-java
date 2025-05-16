class PosterCons {
    String posterConsId;
    double height;
    String material;
    String theme;
    boolean isFramed;
    int width;
    String artist;
    String color;
    int year;
    double price;

    public PosterCons() {
		
	}

    public PosterCons(String posterConsId) {
        this.posterConsId = posterConsId;
    }

    public PosterCons(String posterConsId,double height) {
        this.posterConsId = posterConsId;
        this.height = height;
    }

    public PosterCons(String posterConsId,double height,String material) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
    }

    public PosterCons(String posterConsId,double height,String material,String theme) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
        this.theme = theme;
    }

    public PosterCons(String posterConsId,double height,String material,String theme,boolean isFramed) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
        this.theme = theme;
        this.isFramed = isFramed;
    }

    public PosterCons(String posterConsId,double height,String material,String theme,boolean isFramed,int width) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
        this.theme = theme;
        this.isFramed = isFramed;
        this.width = width;
    }

    public PosterCons(String posterConsId,double height,String material,String theme,boolean isFramed,
	int width,String artist) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
        this.theme = theme;
        this.isFramed = isFramed;
        this.width = width;
        this.artist = artist;
    }
    
    public PosterCons(String posterConsId,double height,String material,String theme,boolean isFramed,int width,
	String artist,String color) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
        this.theme = theme;
        this.isFramed = isFramed;
        this.width = width;
        this.artist = artist;
        this.color = color;
    }
    
    public PosterCons(String posterConsId,double height,String material,String theme,boolean isFramed,int width,
	String artist,String color,int year) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
        this.theme = theme;
        this.isFramed = isFramed;
        this.width = width;
        this.artist = artist;
        this.color = color;
        this.year = year;
    }
    
    public PosterCons(String posterConsId,double height,String material,String theme,boolean isFramed,int width,
	String artist,String color,int year,double price) {
        this.posterConsId = posterConsId;
        this.height = height;
        this.material = material;
        this.theme = theme;
        this.isFramed = isFramed;
        this.width = width;
        this.artist = artist;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void display() {
        System.out.println("PosterCons ID is " + this.posterConsId);
        System.out.println("Height is" + this.height);
        System.out.println("Material is" + this.material);
        System.out.println("Theme is" + this.theme);
        System.out.println("Is Framed is" + this.isFramed);
        System.out.println("Width is" + this.width);
        System.out.println("Artist is " + this.artist);
        System.out.println("Color is " + this.color);
        System.out.println("Year is " + this.year);
        System.out.println("Price is " + this.price);
        System.out.println("\n");
    }
}