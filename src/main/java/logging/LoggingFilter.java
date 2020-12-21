package logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

class LoggingFilter implements Filter {
    public boolean isLoggable(LogRecord record) {
        if (record.getLevel() != Level.INFO) {
            return false;
        }
        return true;
    }
}