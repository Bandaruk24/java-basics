package java8features;
//Optional is a container object that may or may not contain a non-null value.
// Purpose: avoid NullPointerException

import java.util.Optional;

class User{
    private String email;

    User(String email){
        this.email = email;
    }
    // Java forces you to handle null safely.
    public Optional<String> getEmail(){
        return Optional.ofNullable(email);
    }
}
public class OptionalClassExample {
    public static void main(String[] args) {
        
        User user = new User(null);

        String email = user.getEmail().orElse("Email not avalable.");

        System.out.println(email);
        //Why Optional is Better Than Null?
        // Null:	               Optional:
        // * Causes NPE	           * Safe handling
        // * Hard to track	       * Explicit
        // * Error-prone	       * Clean API

        //Conclusion: Optional is a container object used to represent 
        // the presence or absence of a value and avoid NullPointerException.
    }
}
