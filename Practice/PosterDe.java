class PosterDe{
			int width;
			int length;
			String content;
			String material;
			
			public PosterDe(){
				
			}
			public PosterDe(int width){
				this.width=width;
			}
			public PosterDe(int width,int length){
				this.width=width;
				this.length=length;
			}
			public PosterDe(int width,int length,String content){
				this.width=width;
				this.length=length;
				this.content=content;
				
			}
			public PosterDe(int width,int length,String content,String material){
				this.width=width;
				this.length=length;
				this.content=content;
				this.material=material;
			}
			public void info(){
				System.out.println("The Poster information is");
				System.out.println("The widths of the poster is"+this.width);
				System.out.println("The length of the poster is"+this.length);
				System.out.println("The Content of the poster is"+this.content);
				System.out.println("The material of the poster is"+this.material);
				System.out.println("\n");
			}


}