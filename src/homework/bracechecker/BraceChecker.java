package homework.bracechecker;

import java.nio.charset.StandardCharsets;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stck = new Stack();
        Stack stckindex = new Stack();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stck.push(text.charAt(i));
                    stckindex.push(i);
                    break;
                case ')':
                    if (stck.getSize() == -1) {
                        System.out.println("Error: only closed " + text.charAt(i) + " at " + i);
                    } else if (stck.pop() == '(') {
                        System.out.println("True:  opened ( and closed " + text.charAt(i) + " at " + i);
                        stckindex.pop();
                    } else System.out.println("Error: opened ( but closed " + text.charAt(i) + " at " + i);
                    break;

                case '}':
                    if (stck.getSize() == -1) {
                        System.out.println("Error: only closed " + text.charAt(i) + " at " + i);
                    } else if (stck.pop() == '{') {
                        System.out.println("True:  opened { and closed " + text.charAt(i) + " at " + i);
                        stckindex.pop();
                    } else System.out.println("Error: opened { but closed " + text.charAt(i) + " at " + i);
                    break;

                case ']':
                    if (stck.getSize() == -1) {
                        System.out.println("Error: only closed " + text.charAt(i) + " at " + i);
                    } else if (stck.pop() == '[') {
                        System.out.println("True:  opened [ and closed " + text.charAt(i) + " at " + i);
                        stckindex.pop();
                    } else System.out.println("Error: opened [ but closed " + text.charAt(i) + " at " + i);
                    break;
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (stckindex.getSize()!= -1) {
                System.out.println("Error: only opened at " + stckindex.pop());
            }
        }
    }
}




