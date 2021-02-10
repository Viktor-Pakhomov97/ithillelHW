package com.pakhomovHW10;

import java.io.IOException;

public class ConsoleLogger extends Logger {

    public void log(String messege) {
        System.out.println(getDate() + " " + messege);
    }

    public void log(String message, LogLevel level) throws IOException {
        System.out.println(getDate() + " " + level + ": " + message);

    }

}
