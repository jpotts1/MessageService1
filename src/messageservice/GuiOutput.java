/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;
import javax.swing.JOptionPane;
/**
 *
 * @author justinpotts
 */
public class GuiOutput implements MessageSender  {

    
    @Override
    public void sendMessage (String message) {
           
        JOptionPane.showMessageDialog(null, message);
    
    }
        
}
    

