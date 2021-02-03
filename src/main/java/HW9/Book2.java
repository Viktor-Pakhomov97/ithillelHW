package HW9;


import lombok.Value;

import java.util.Date;

@Value
final class Book2 {
    Author2 author;
    Date issueDate;
    String genre;
    Long isbn;
}
