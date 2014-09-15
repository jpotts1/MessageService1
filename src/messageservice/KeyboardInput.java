/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Scanner;

/**
 *
 * @author justinpotts
 */
public class KeyboardInput implements MessageReader {

    Scanner keyboard = new Scanner(System.in);
    private String message;

    public KeyboardInput() {
        // Empty constructor
    }

  
    @Override
    public String obtainMessage() {
    System.out.println("Please type a message: ");
    setMessage(keyboard.nextLine());
    return message;
    }
    
    public String getMessage() {
    return message;
    }
    
    public void setMessage(String message) {
    this.message = message;
    }
    
}
