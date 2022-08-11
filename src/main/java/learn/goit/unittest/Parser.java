package learn.goit.unittest;

public class Parser {
    private String separator;

    public Parser(char separator) {
        this.separator = ""+separator;
    }
    public Parser(String separator) {
        this .separator = separator;
    }

    public String [] parse (String s) {
        return s.split(separator);
    }
}
