package learn.goit.unittest;

public class Printer {
    public void print (String s) {
        System.out.println(s);
    }
    public void print (String [] a) {
        System.out.println(String.join("|=|", a));
    }
}