package HomeWork11;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Mouse {

    @Setter
    @Getter
    String mouse;
    public int calories;

    Mouse(String mouse, int calories) {
        this.mouse = mouse;
        this.calories = calories;
    }

}

