package com.pakhomovHW10;

import java.io.IOException;

public class TestLogger {
    public static void main(String[] args) throws IOException {


        Logger logger = new ConsoleLogger();
        logger.log("Error");
        logger.log("Error", LogLevel.INFO);

        FileLogger logger1 = new FileLogger();
        logger1.log("Error!", LogLevel.INFO);
        logger1.log("Error again");
    }
}
