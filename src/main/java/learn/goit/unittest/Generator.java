package learn.goit.unittest;

public class Generator {
    private static final int DEFAULT_RANDOM_STRING_LENGTH = 80;

    public String generate () {
        return generateRandomString (DEFAULT_RANDOM_STRING_LENGTH);
    }

    private String generateRandomString (int stringLength) {
        char [] chars = new char [stringLength];
        for (int i = 0; i < chars.length; i++) {
            chars [i] = (char)((int)(Math.random() * 100) + 0x20);
        }
        return new String(chars);
    }
}
