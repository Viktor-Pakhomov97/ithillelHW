package HW9;

import lombok.Value;

import java.util.Date;

@Value
public class Book {
    Author author;
     Date issueDate;
     String genre;
     Long isbn;

}
