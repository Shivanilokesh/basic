 
    public class Greeting {

        // function with a parameter and no return value
        public void sayHi(String name) {
            System.out.println("Hii, " + name );
        }
    
        public static void main(String[] args) {
           
            Greeting greeting = new Greeting();
            
            // Call the sayHi method with a parameter
            greeting.sayHi("Shivani");
        }
    }
    
    

