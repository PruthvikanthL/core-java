class Stanza {
    String title;
    int lines;
    String rhymeScheme;
    String mood;
    boolean hasRefrain;
    String poet;
    int year;
    String language;
    String theme;
    boolean isPublished;

    public Stanza() {}

    public Stanza(String title) {
        this.title = title;
    }

    public Stanza(String title,int lines) {
        this.title = title;
        this.lines = lines;
    }

    public Stanza(String title,int lines,String rhymeScheme) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
    }

    public Stanza(String title,int lines,String rhymeScheme,String mood) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.mood = mood;
    }

    public Stanza(String title,int lines,String rhymeScheme,String mood,boolean hasRefrain) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.mood = mood;
        this.hasRefrain = hasRefrain;
    }

    public Stanza(String title,int lines,String rhymeScheme,String mood,boolean hasRefrain,String poet) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.mood = mood;
        this.hasRefrain = hasRefrain;
        this.poet = poet;
    }

    public Stanza(String title,int lines,String rhymeScheme,String mood,boolean hasRefrain,String poet, 
	int year) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.mood = mood;
        this.hasRefrain = hasRefrain;
        this.poet = poet;
        this.year = year;
    }

    public Stanza(String title,int lines,String rhymeScheme,String mood,boolean hasRefrain,String poet, 
	int year,String language) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.mood = mood;
        this.hasRefrain = hasRefrain;
        this.poet = poet;
        this.year = year;
        this.language = language;
    }

    public Stanza(String title,int lines,String rhymeScheme,String mood,boolean hasRefrain,String poet, 
	int year,String language,String theme) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.mood = mood;
        this.hasRefrain = hasRefrain;
        this.poet = poet;
        this.year = year;
        this.language = language;
        this.theme = theme;
    }

    public Stanza(String title,int lines,String rhymeScheme,String mood,boolean hasRefrain,String poet,
	int year,String language,String theme,boolean isPublished) {
        this.title = title;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.mood = mood;
        this.hasRefrain = hasRefrain;
        this.poet = poet;
        this.year = year;
        this.language = language;
        this.theme = theme;
        this.isPublished = isPublished;
    }

    public void display() {
        System.out.println("Title is"+this.title);
        System.out.println("Lines is"+this.lines);
        System.out.println("Rhyme Scheme is"+this.rhymeScheme);
        System.out.println("Mood is"+this.mood);
        System.out.println("Has Refrain is"+this.hasRefrain);
        System.out.println("Poet is"+this.poet);
        System.out.println("Year is"+this.year);
        System.out.println("Language is"+this.language);
        System.out.println("Theme is"+this.theme);
        System.out.println("Is Published is"+this.isPublished);
        System.out.println("\n");
    }
}
