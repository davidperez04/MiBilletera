package model;

public class Utilities {
    
    public static String convertFormat(float amount){
        String newFormat = "$"+amount+"0";
        return newFormat;
    }
}
