package Model;

public class Games {

    private String gameName;
    private int genre;
    private String publisher;
    private String releaseDate;
    private int maxPlayerCount;

    public Games(String gameName, int genre, String publisher,
                 String releaseDate, int maxPlayerCount) {
        this.gameName = gameName;
        this.genre = genre;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.maxPlayerCount = maxPlayerCount;
    }

    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGenre() {
        return genre;
    }
    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getMaxPlayerCount() {
        return maxPlayerCount;
    }
    public void setMaxPlayerCount(int maxPlayerCount) {
        this.maxPlayerCount = maxPlayerCount;
    }

    // create copies of class variable value in terms of data capsulation
    public Games cloneGame() {
        return new Games(gameName, genre, publisher, releaseDate,
                maxPlayerCount);
    }

}
