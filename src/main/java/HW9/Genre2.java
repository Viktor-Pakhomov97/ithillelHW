package HW9;

import lombok.Getter;

public enum Genre2 {
    FAIRY_TALE("Fairy tale"), FANTASY("fantasy");
    @Getter
    String genre;

    Genre2(String genre) {
        this.genre = genre;
    }
}