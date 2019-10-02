package stacksqueues;

public class Browser {

    private CarlStack<String> forward;
    private CarlStack<String> backward;
    String current;

    public Browser() {
        this.forward = new ArrayStack(10);
        this.backward = new ArrayStack(10);
    }

    public void go(String url) {
        System.out.println("Visiting: " + url);
        if(current != null) {
            this.backward.push(current);
        }
        current = url;
        while(!this.forward.isEmpty()) {
            try {
                this.forward.pop();
            } catch (EmptyStackException e) {
                System.out.println("We should never get here because we check if the stack is empty before popping");
            }
        }
    }

    public void back() {
        try {
            String url = this.backward.pop();
            this.forward.push(current);
            System.out.println("Visiting: " + url);
            current = url;

        } catch (EmptyStackException e) {
            System.out.println("Can't go back");
        }
    }

    public void forward() {
        try {
            String url = this.forward.pop();
            this.backward.push(current);
            System.out.println("Visiting: " + url);
            current = url;

        } catch (EmptyStackException e) {
            System.out.println("Can't go forward");
        }
    }
}
