package HW8;
public enum Genre {
    FAIRY_TALE("Fairy tale"), FANTASY("fantasy");
    String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
