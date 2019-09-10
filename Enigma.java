package FullMachine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Christopher
 */

public class Enigma {
    
    Ring[] rings;
    Ring innerRing;
    Ring middleRing;
    Ring outerRing;
    
    File file;
    
    int[] ringChoices;
    int[] startSettings;
    int codeChoice;
    
    String plugboard;
    String message;
    String newMessage;
    
    public Enigma(){
        
        rings = new Ring[5];
        for(int i=0; i<rings.length; i++){
            rings[i] = new Ring(i);
        }
        
        ringChoices = new int[3];
        startSettings = new int[3];
        codeChoice = 1;
        
        plugboard = "TW BI UY GP CK JQ DL RV EM AH";
        message = "This is a default message";
        newMessage = "";
    }
    
    //Parameter list: Ring choices, Start settings, Plugboard string, Message, Encode or decode choice
    public Enigma(int[] c, int[] s, String p, String m, int d){
        
        rings = new Ring[5];
        for(int i=0; i<rings.length; i++){
            rings[i] = new Ring(i+1);
        }
        
        ringChoices = c;
        startSettings = s;
        codeChoice = d;
        
        plugboard = p;
        message = m;
        newMessage = "";
        
        for(int i=0; i<ringChoices.length; i++){
            
            for(int j=0; j<rings.length; j++){
                
                if(rings[j].getID() == ringChoices[i]){
                    //System.out.println("If statement was reached");
                    switch (i) {  
                        case 0:
                            innerRing = rings[j];
                            innerRing.rotate( startSettings[i]-1 );
                            //System.out.println("Inner ring initiated");
                            break;
                        case 1:
                            middleRing = rings[j];
                            middleRing.rotate( startSettings[i]-1 );
                            //System.out.println("Middle ring initiated");
                            break;
                        case 2:
                            outerRing = rings[j];
                            outerRing.rotate( startSettings[i]-1 );
                            //System.out.println("Outer ring initiated");
                            break;
                        default:
                            //System.out.println("Nothing was done in the switch");
                            break;
                    }
                }
                
            }
            
        }    
    }//end of overloaded constructor
    
    //Parameter list: Ring choices, Start settings, Plugboard string, File, Encode or decode choice
    public Enigma(int[] c, int[] s, String p, File f, int d){
        
        rings = new Ring[5];
        for(int i=0; i<rings.length; i++){
            rings[i] = new Ring(i+1);
        }
        
        ringChoices = c;
        startSettings = s;
        codeChoice = d;
        
        plugboard = p;
        file = f;
        newMessage = "";
        
        for(int i=0; i<ringChoices.length; i++){
            
            for(int j=0; j<rings.length; j++){
                
                if(rings[j].getID() == ringChoices[i]){
                    //System.out.println("If statement was reached");
                    switch (i) {  
                        case 0:
                            innerRing = rings[j];
                            innerRing.rotate( startSettings[i]-1 );
                            //System.out.println("Inner ring initiated");
                            break;
                        case 1:
                            middleRing = rings[j];
                            middleRing.rotate( startSettings[i]-1 );
                            //System.out.println("Middle ring initiated");
                            break;
                        case 2:
                            outerRing = rings[j];
                            outerRing.rotate( startSettings[i]-1 );
                            //System.out.println("Outer ring initiated");
                            break;
                        default:
                            //System.out.println("Nothing was done in the switch");
                            break;
                    }
                }
                
            }
            
        }    
    }//end of overloaded constructor
    
    public void run(){
        char c;
        message = message.toUpperCase();
        
        for(int i=0; i<message.length(); i++){
            
            c = message.charAt(i); 
            if(c == ' ') c = '#';
            
            if(codeChoice == 1) c = encode(c);
            if(codeChoice == 2) c = decode(c);
            newMessage+=c;
            
        }
        
        System.out.println( addSpaces(newMessage) );
        
    }// end of run
    
    
    public char encode(char c){
        
        c = plugboard(c);
        
        try{
        //innerRing.getKey().indexOf(c)
        c = outerRing.getKey().charAt( innerRing.getKey().indexOf(c) );
        //middleRing.getKey().indexOf(c)
        c = outerRing.getKey().charAt( middleRing.getKey().indexOf(c) );
        }
        catch(StringIndexOutOfBoundsException e){
            return c;
        }
        
        innerRing.rotate();
        
        //Rotates another ring if the initial ring has done a full cycle
        if(innerRing.getTimesRotated() == 0){
            middleRing.rotate();
            
            if(middleRing.getTimesRotated() == 0)
            outerRing.rotate();
        
        }
        
        c = plugboard(c);
        
        return c;
        
    }
    
    public char decode(char c){
        
        c = plugboard(c);
        /*
        //outerRing.getKey().indexOf(c)
        c = middleRing.getKey().charAt( outerRing.getKey().indexOf(c) );
        //outerRing.getKey().indexOf(c)
        c = innerRing.getKey().charAt( outerRing.getKey().indexOf(c) );
        */
        try{
            
        //outerRing.getKey().indexOf(c)
        c = middleRing.getKey().charAt( outerRing.getKey().indexOf(c) );
        //outerRing.getKey().indexOf(c)
        c = innerRing.getKey().charAt( outerRing.getKey().indexOf(c) );
        
        }//end of try
        catch(StringIndexOutOfBoundsException e){
            return c;
        }
        
        innerRing.rotate();
        
        //Rotates another ring if the initial ring has done a full cycle
        if(innerRing.getTimesRotated() == 0){
            middleRing.rotate();
            
            if(middleRing.getTimesRotated() == 0)
            outerRing.rotate();
        
        }
        
        c = plugboard(c);
        
        return c;
        
    }
    
    public char plugboard(char c){
        //Checks if the plugboard contains the char
        if(plugboard.indexOf(c) != -1){
            //Makes sure the program dosen't get out of the array
            if( (plugboard.indexOf(c) > 0) && (plugboard.indexOf(c) < 28 ) ){
                
                if(plugboard.charAt(plugboard.indexOf(c) - 1) != ' '){
                    c = plugboard.charAt(plugboard.indexOf(c) - 1);
                    return c;
                }
                else{
                    c = plugboard.charAt(plugboard.indexOf(c) + 1);
                    return c;
                }
                
            }
            else{
                if(plugboard.indexOf(c) == 0){
                    c = plugboard.charAt(1);
                    return c;
                }
                else{
                    c = plugboard.charAt(27);
                    return c;
                }
            }
        }
        
        
        else{
            return c;
        }
    }
    
    public void runWithFile(){
        
        if(codeChoice == 1){
            encodeWithFile();
            System.out.println("File has been encoded");
        }
        
        if(codeChoice == 2){
            decodeWithFile();
            System.out.println("File has been decoded");
        }
        
    }// end of run
    
    public void encodeWithFile() {
        char c;
        try {
            
            Path inputFile = Paths.get(file.getAbsolutePath());
            Path outputFile = Paths.get("EncodedFile.txt");
            BufferedReader r = Files.newBufferedReader(inputFile, StandardCharsets.UTF_8);
            BufferedWriter w = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8);
            
            String line;
            while ((line = r.readLine()) != null) {
                message = line;
                message = message.toUpperCase();
                
                for (int i = 0; i < message.length(); i++) {
                    c = message.charAt(i);
                    if(c == ' ') c = '#';
                    c = plugboard(c);
                    
                    try {
                        //innerRing.getKey().indexOf(c)
                        c = outerRing.getKey().charAt(innerRing.getKey().indexOf(c));
                        //middleRing.getKey().indexOf(c)
                        c = outerRing.getKey().charAt(middleRing.getKey().indexOf(c));
                    } catch (StringIndexOutOfBoundsException e) {
                        newMessage+=c;
                        continue;
                    }
                    
                    innerRing.rotate();

                    //Rotates another ring if the initial ring has done a full cycle
                    if (innerRing.getTimesRotated() == 0) {
                        middleRing.rotate();
                        
                        if (middleRing.getTimesRotated() == 0) {
                            outerRing.rotate();
                        }
                        
                    }
                    
                    c = plugboard(c);
                    newMessage+=c;
                    
                }//end of for loop

                //Output line to file and prepare for next line
                w.write(addSpaces(newMessage));
                w.newLine();
                newMessage = "";
                
            }//end of while loop

            //Close the BufferedReader and BufferedWriter
            r.close();
            w.close();
            
        } catch (Throwable ex) {
            System.out.println("There was an error while encoding with a file");
        }
        
    }
    
    public void decodeWithFile() {
        char c;
        try {
            Path inputFile = Paths.get(file.getAbsolutePath());
            Path outputFile = Paths.get("DecodedFile.txt");
            BufferedReader r = Files.newBufferedReader(inputFile, StandardCharsets.UTF_8);
            BufferedWriter w = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8);
            
            String line;
            while ((line = r.readLine()) != null) {
                message = line;
                message = message.toUpperCase();
                
                for (int i = 0; i < message.length(); i++) {
                    c = message.charAt(i);
                    if(c == ' ') c = '#';
                    c = plugboard(c);
                    
                    try {
                        //outerRing.getKey().indexOf(c)
                        c = middleRing.getKey().charAt( outerRing.getKey().indexOf(c) );
                        //outerRing.getKey().indexOf(c)
                        c = innerRing.getKey().charAt( outerRing.getKey().indexOf(c) );
                    } catch (StringIndexOutOfBoundsException e) {
                        newMessage+=c;
                        continue;
                    }
                    
                    innerRing.rotate();

                    //Rotates another ring if the initial ring has done a full cycle
                    if (innerRing.getTimesRotated() == 0) {
                        middleRing.rotate();
                        
                        if (middleRing.getTimesRotated() == 0) {
                            outerRing.rotate();
                        }
                        
                    }
                    
                    c = plugboard(c);
                    newMessage+=c;
                    
                }//end of for loop

                //Output line to file and prepare for next line
                w.write(addSpaces(newMessage));
                w.newLine();
                newMessage = "";
                
            }//end of while loop

            //Close the BufferedReader and BufferedWriter
            r.close();
            w.close();
            
        } catch (Throwable ex) {
            System.out.println("There was an error while decoding with a file");
        }
        
    }
    
    //Replaces any '#' with ' '
    public String addSpaces(String m){
        char[] temp = new char[m.length()];
        String updatedMessage = "";
        
        for(int i = 0; i<m.length(); i++){
            temp[i] = m.charAt(i);
        }
        
        for(int i = 0; i<m.length(); i++){
            if(temp[i] == '#') temp[i] = ' ';
        }
        
        for(int i = 0; i<m.length(); i++){
            updatedMessage+=temp[i];
        }
        
        return updatedMessage;
        
    }
    
    public void test(){
        System.out.println("Inner ring:\n" + innerRing.getKey());
        
        System.out.println("Middle ring:\n" + middleRing.getKey());
        
        System.out.println("Outer ring:\n" + outerRing.getKey());
        
        run();
    }
    
}
