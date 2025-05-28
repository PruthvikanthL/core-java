class StanzaRunner {
    public static void main(String[] args) {
        Stanza stanza1 = new Stanza();
        stanza1.display();

        String title2 = "The Night Sky";
        Stanza stanza2 = new Stanza(title2);
        stanza2.display();

        String title3 = "Ocean Waves";
        int lines3 = 4;
        Stanza stanza3 = new Stanza(title3,lines3);
        stanza3.display();

        String title4 = "Autumn Breeze";
        int lines4 = 6;
        String rhymeScheme4 = "ABAB";
        Stanza stanza4 = new Stanza(title4,lines4,rhymeScheme4);
        stanza4.display();

        String title5 = "Spring Bloom";
        int lines5 = 8;
        String rhymeScheme5 = "AABB";
        String mood5 = "Joyful";
        Stanza stanza5 = new Stanza(title5,lines5,rhymeScheme5,mood5);
        stanza5.display();

        String title6 = "Winter Night";
        int lines6 = 12;
        String rhymeScheme6 = "ABCB";
        String mood6 = "Melancholic";
        boolean hasRefrain6 = true;
        Stanza stanza6 = new Stanza(title6,lines6,rhymeScheme6,mood6,hasRefrain6);
        stanza6.display();

        String title7 = "Sunset Glow";
        int lines7 = 10;
        String rhymeScheme7 = "AABBCC";
        String mood7 = "Romantic";
        boolean hasRefrain7 = false;
        String poet7 = "John Doe";
        Stanza stanza7 = new Stanza(title7,lines7,rhymeScheme7,mood7,hasRefrain7,poet7);
        stanza7.display();

        String title8 = "Rainy Thoughts";
        int lines8 = 14;
        String rhymeScheme8 = "ABABCC";
        String mood8 = "Reflective";
        boolean hasRefrain8 = true;
        String poet8 = "Jane Smith";
        int year8 = 2005;
        Stanza stanza8 = new Stanza(title8,lines8,rhymeScheme8,mood8,hasRefrain8,poet8,year8);
        stanza8.display();

        String title9 = "Golden Fields";
        int lines9 = 16;
        String rhymeScheme9 = "AABBAABB";
        String mood9 = "Peaceful";
        boolean hasRefrain9 = false;
        String poet9 = "Emily Brown";
        int year9 = 2010;
        String language9 = "English";
        Stanza stanza9 = new Stanza(title9,lines9,rhymeScheme9,mood9,hasRefrain9,poet9,year9,language9);
        stanza9.display();

        String title10 = "Moonlit Dreams";
        int lines10 = 20;
        String rhymeScheme10 = "ABABABCC";
        String mood10 = "Mystical";
        boolean hasRefrain10 = true;
        String poet10 = "William Blake";
        int year10 = 1885;
        String language10 = "French";
        String theme10 = "Fantasy";
        boolean isPublished10 = true;
        Stanza stanza10 = new Stanza(title10,lines10,rhymeScheme10,mood10,hasRefrain10,poet10,year10, 
		language10,theme10,isPublished10);
        stanza10.display();
    }
}
