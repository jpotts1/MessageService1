/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author justinpotts
 */
public class MemoryInput implements MessageReader {
    
    @Override
    public String obtainMessage() {
    return "Welcome";
    }
}

