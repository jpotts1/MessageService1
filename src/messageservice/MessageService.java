/*
TASK #2
–
apply what you’ve learned about the DIP
dependcy inversion p
and other best practices to date
and write a program that serves as a message service. The idea is that messages have
to be acquired from somewhere and then provided to somewhere else. For example,
you might get a random message from an array of Strings and then send the selected
message to the console for output. Try to imagine as least two different ways to
acquire messages and two different ways to deliver messages. Then use the DIP to
make the acquiring options interchangeable and the delivering options
interchangeable. Demonstrate your solution by creating a running program. Don’t
forget other best practices such as Single Responsibility Principle and Principle of
Least Knowledge and Encapsulation.
 */
package messageservice;

/**
 *
 * @author justinpotts
 */
 public class MessageService {

        private MessageSender output;
        private MessageReader input;
        

    public MessageService(MessageSender output, MessageReader input) {
        this.input = input;
        this.output = output;

    }
    
    public void sendMessage() {
       output.sendMessage(input.obtainMessage());
    }
    
    
    
    public MessageReader getInput() {
        return input;
    }

    public void setInput(MessageReader input) {
        this.input = input;
    }

    public MessageSender getOutput() {
        return output;
    }

    public void setOutput(MessageSender output) {
        this.output = output;
    }
    
   
        
        
}



    

