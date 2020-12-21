package logging;

import java.io.IOException;
import java.util.logging.*;

public class Core {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger( Core.class.getName());
        Handler fileHandler = null;
        try {
            fileHandler = new FileHandler("default.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        fileHandler.setFormatter(new XMLFormatter());

        Filter logFilter = new LoggingFilter();
        logger.setFilter(logFilter);

        logger.info("Info log message");
        logger.severe("Bad news guy");
        logger.warning("Warning");

        //only logger.info, cause of filter
    }
    }


