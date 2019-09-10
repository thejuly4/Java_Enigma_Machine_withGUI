package FullMachine;

/**
 *
 * @author Christopher
 */

public class Ring {
    
    private int id;
    private int rotor;
    private int timesRotated;
    private String key;
    
    public Ring(){
        id = 1;
        rotor = 1;
        key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#";
        timesRotated = 0;
    }
    
    public Ring(int r){
        rotor = r;
        timesRotated = 0;
        
        switch (rotor) {
            case 1:
                id = 1;
                key = "GNUAHOVBIPWCJQXDKRY#ELSZFMT";
                break;
            case 2:
                id = 2;
                key = "EJ#OTYCHMRWAFKPUZDINSXBGLQV";
                break;
            case 3:
                id = 3;
                key = "BDFHJLNPRTVXZACEGI#KMOQSUWY";
                break;
            case 4:
                id = 4;
                key = "KPHDEAC#VTWQMYNLXSURZOJFBGI";
                break;
            case 5:
                id = 5;
                key = "NDYGLQICVEZRPTAOXWBMJSUHK#F";
                break;
            default:
                id = 3;
                key = "BDFHJLNPRTVXZACEGI#KMOQSUWY";
                break;
        }
        
    } //end of constructor with paramaters
    
    public void rotate() {
        
        if(timesRotated < 27){
            //Create temp char array to re-arrange letters
            char[] temp = new char[key.length()];

            //Fill temp array with input values
            for (int i = 0; i < key.length() - 1; i++) {
                temp[i+1] = key.charAt(i);
            }
            temp[0] = key.charAt(key.length() - 1);

            //Replace inputKey with new rotated values
            String keyTemp = "";
            for (int i = 0; i < key.length(); i++) {
                keyTemp += temp[i];
            }

            key = keyTemp;
            timesRotated++;
            
            //test
            //System.out.println("rotation done");
        }
        else{
            char[] temp = new char[key.length()];
            for (int i = 0; i < key.length() - 1; i++) {
                temp[i+1] = key.charAt(i);
            }
            temp[0] = key.charAt(key.length() - 1);
            String keyTemp = "";
            for (int i = 0; i < key.length(); i++) {
                keyTemp += temp[i];
            }

            key = keyTemp;
            timesRotated = 0;
            
            //test
            //System.out.println("rotation done");
        }
        
    }//end of rotate
    
    public void rotate(int s){
        if(s == 0){
            //Does not rotate since starting position was entered as 1
        }
        else{
            for(int i=0; i<s; i++){
                rotate();
            }
        }
    }
    
    public int getID(){
        return id;
    }
    
    public String getKey(){
        return key;
    }
    
    public void setTimesRotated(int t){
        timesRotated = t;
    }
    public int getTimesRotated(){
        return timesRotated;
    }
    
} // end of class
