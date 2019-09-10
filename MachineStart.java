package FullMachine;

import java.io.File;

/**
 *
 * @author Christopher
 */

public class MachineStart {
    
    public MachineStart(int[] r, int[] s, String p, File f, int c){

        //Parameter list: Ring choices, Start settings, Plugboard string, File, Encode or decode choice
        Enigma machine = new Enigma(r, s , p, f, c);

        machine.runWithFile();
            
    }
    
}
