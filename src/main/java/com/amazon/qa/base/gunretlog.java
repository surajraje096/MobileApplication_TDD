package com.amazon.qa.base;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class gunretlog {


    static final Logger logger = Logger.getLogger(gunretlog.class);
    static final String LOG_PROPERTIES_FILE = "log4j.properties";
 
    public static void main(String[] args) {
        new gunretlog();
        // sample info log message
        logger.info("leaving the main method of Log4JDemo");
    }
 
    public gunretlog() {
        initializeLogger();
        // sample info log message
        logger.info("Log4jDemo - leaving the constructor ...");
    }
 
    private void initializeLogger() {
        Properties logProperties = new Properties();
 
        try {
            // load log4j properties configuration file
            logProperties.load(new FileInputStream(LOG_PROPERTIES_FILE));
            PropertyConfigurator.configure(logProperties);
            logger.info("Logging initialized.");
        } catch (IOException e) {
            logger.error("Unable to load logging property :", e);
        }
        try {
            FileInputStream fstream = new FileInputStream("D:\\textfile.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
            in.close();
        } catch (FileNotFoundException fe) {
            logger.error("File Not Found", fe);
            logger.warn("This is a warning message");
            logger.trace("This message will not be logged since log level is set as DEBUG");
        } catch (IOException e) {
            logger.error("IOEXception occured:", e);
        }
    }
}
