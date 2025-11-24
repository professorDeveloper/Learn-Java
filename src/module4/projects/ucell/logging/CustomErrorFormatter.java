package module4.projects.ucell.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomErrorFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {

        StringBuilder sb = new StringBuilder();

        if (record.getLevel().intValue() >= Level.SEVERE.intValue()) {
            sb.append("\n====================== ERROR ======================\n");
            sb.append("Message: ").append(record.getMessage()).append("\n");

            if (record.getThrown() != null) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                record.getThrown().printStackTrace(pw);

                sb.append("Stacktrace:\n").append(sw).append("\n");
            }

            sb.append("Time: ").append(String.format("%1$tc", record.getMillis())).append("\n");
            sb.append("===================================================\n\n");
            return sb.toString();
        } else {
            return String.format("%4$s: %5$s [%1$tc]%n",
                    record.getMillis(),
                    record.getSourceClassName(),
                    record.getSourceMethodName(),
                    record.getLevel().getName(),
                    record.getMessage());
        }

    }
}
