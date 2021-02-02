package HW9;

import lombok.Getter;


public enum Genre {
    FAIRY_TALE("Fairy tale"), FANTASY("fantasy");
    @Getter
    String genre;

    Genre(String genre) {
        this.genre = genre;
    }

}
