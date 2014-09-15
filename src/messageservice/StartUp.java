/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;
import java.util.Random;

/**
 *
 * @author justinpotts
 */
public class StartUp {
    
    public static void main(String[] args) {
         MessageService messageService = new MessageService(new ConsoleOutput(), new KeyboardInput());
         messageService.sendMessage();
         messageService.setInput(new MemoryInput());
         messageService.sendMessage();         
    }
}


