package com.pakhomovHW10;

import java.io.IOException;
public class ConsoleLogger extends Logger {
    @Override
    public void log(String messege) {
        System.out.println(getDate() + " " + messege);
    }
    @Override
    public void log(String message, LogLevel level) throws IOException {
        System.out.println(getDate() + " " + level + ": " + message);

    }

}
