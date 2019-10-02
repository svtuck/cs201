package stacksqueues;

public class StackTester {

    public static void main(String[] args) {
        CarlStack<String> stack = new ArrayStack(10);
        String expression = "2 + ( 7 * 9 ) / ( 2 + ( 3 - 9 ) )";
        String[] tokens = expression.split(" ");
        for(String token : tokens) {
            if( token.equals("(")) {
                stack.push(token);
            }

            if( token.equals(")")) {
                try {
                    stack.pop();
                }
                catch (EmptyStackException e) {
                    System.out.println("Too many right parentheses");
                    return;
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println("parentheses are balanced");
        } else {
            System.out.println("Too many left parentheses");
        }



        Browser b = new Browser();

        b.go("google.com");

        b.go("nytimes.com");

        b.back();

        b.forward();

        b.go("carleton.edu");

        b.back();
        b.back();
        b.forward();
        b.back();
        b.forward();

    }

}
