
package messageservice;

/**
 *
 * @author justinpotts
 */
public class ConsoleOutput implements MessageSender{

    @Override
    public void sendMessage(String message) {
        
        System.out.println(message);
    
    }
    
}
