package homework.bracechecker;

public class BraceChecker {
    private String text;
    public BraceChecker(String text) {
        this.text = text;
    }
    public void check() {
        Stack stck = new Stack();

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stck.push(text.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    if (stck.size == -1) {
                        System.out.println("Error: only closed " + text.charAt(i) + " at " + i);
                    } else
                        switch (stck.pop()) {
                            case '(':
                                if (text.charAt(i) == ')') {
                                    System.out.println("True:  opened ( and closed " + text.charAt(i) + " at " + i);
                                } else System.out.println("Error: opened ( but closed " + text.charAt(i) + " at " + i);
                                break;
                            case '{':
                                if (text.charAt(i) == '}') {
                                    System.out.println("True:  opened { and closed " + text.charAt(i) + " at " + i);
                                } else System.out.println("Error: opened { but closed " + text.charAt(i) + " at " + i);
                                break;
                            case '[':
                                if (text.charAt(i) == ']') {
                                    System.out.println("True:  opened [ and closed " + text.charAt(i) + " at " + i);
                                } else System.out.println("Error: opened [ but closed " + text.charAt(i) + " at " + i);
                                break;
                        }
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (stck.size != -1) {
                System.out.println("Error: only opened " + stck.pop());
            }
        }
    }
}





