class MoviesDir {
    public void MovieDirName(Movies movie) {
        if (movie == Movies.GOODACHARI) {
            System.out.println("The Movie " + movie + " is Directed by --> SASHI KIRAN TIKKA");
        } else if (movie == Movies.EVARU) {
            System.out.println("The Movie " + movie + " is Directed by --> VENKAT RAMJI");
        } else if (movie == Movies.MAJOR) {
            System.out.println("The Movie " + movie + " is Directed by --> SASHI KIRAN TIKKA");  // Fixed typo
        } else if (movie == Movies.HIT) {
            System.out.println("The Movie " + movie + " is Directed by --> SAILESH KOLANU");
        } else if (movie == Movies.HIT3) {
            System.out.println("The Movie " + movie + " is Directed by --> SAILESH KOLANU");
        } else {
            System.out.println("Sorry, we don't have data for this movie.");
        }
    }
}
