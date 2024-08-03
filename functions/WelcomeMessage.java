public class WelcomeMessage {

    // Method with no parameters and a return value
    public String getWelcomeMessage() {
        return "Welcome to bangalore";
    }

    public static void main(String[] args) {
        
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        
        
        String message = welcomeMessage.getWelcomeMessage();
        
        // Print the message
        System.out.println(message);
    }
}

