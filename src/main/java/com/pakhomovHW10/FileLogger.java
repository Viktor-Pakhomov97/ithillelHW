package com.pakhomovHW10;

import java.io.IOException;
import java.io.*;
public class FileLogger extends Logger {
    @Override
    public void log(String messege) {
        Writer logger;
        try {
            logger = new FileWriter("example.txt", true);
            logger.write(getDate() + " " + messege);
            logger.close();
        } catch (IOException e) {
            System.err.println("Error!");
        }
    }
    @Override
    public void log(String messege,LogLevel level) throws IOException {
        Writer logger  = new FileWriter("example.txt",true);
        logger.write(getDate() + " " + level + ": " + messege);
        logger.close();
    }

}