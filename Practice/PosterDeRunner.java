class PosterDeRunner{
public static void main(String[] args){
	PosterDe posterde=new PosterDe();
	posterde.info();
	int width=34;
	PosterDe posterde1=new PosterDe(width);
	posterde1.info();
	int width1=44;
	int length=16;
	PosterDe posterde2=new PosterDe(width1,length);
	posterde2.info();
	int width2=38;
	int length1=24;
	String content="Education";
	PosterDe posterde3=new PosterDe(width2,length1,content);
	posterde3.info();
	int width3=56;
	int length2=32;
	String content2="Movie";
	String material="silicon";
	PosterDe posterde4=new PosterDe(width3,length2,content2,material);
	posterde4.info();
	
	
}



}