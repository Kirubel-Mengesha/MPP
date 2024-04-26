package PatternMatching;

import javax.swing.*;
import java.util.regex.*;

class Ch9PMCountJava {

    public static void main (String[] args) {

        String   document;
        int      javaCount;


        document  = JOptionPane.showInputDialog(null, "Sentence:");

        javaCount = PatternMatcher.myFind("java",document);

        JOptionPane.showMessageDialog(null,
                "The word 'java' occurred " +
                        javaCount + " times.");
    }
}
