package example.java.net;

public class Logger {

    private final String name;
    private boolean debugEnabled;

    public Logger(String name) {
        this.name = name;
    }

    public static Logger getLogger(String name) {
        return new Logger(name);
    }

    public void debug(String s) {
        System.out.println("DEBUG: " + name + ": " + s);
    }

    public void info(String s) {
        System.out.println("INFO: " + name + ": " + s);
    }

    public void error(String s, Throwable ex) {
        System.err.println("ERROR: " + name + ": " + s);
        if (ex != null) {
            ex.printStackTrace(System.err);
        }
    }

    public boolean isDebugEnabled() {
        return debugEnabled;
    }

    public void setDebugEnabled(boolean debugEnabled) {
        info("DebugEnabled set to " + debugEnabled);
        this.debugEnabled = debugEnabled;
    }
}
