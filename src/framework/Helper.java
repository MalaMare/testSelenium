
package framework;


public class Helper {
    
    public static String getRandomText() {
        
        int random = (int)(Math.random() * 250 + 1);
        String randomText = "category" + random;
        return randomText;
        
        //return "category" + (int) (Math.random() * 500 + 1);
        
    }
    
    //public static String getRandomUrl () {
        
    //    return "";
    //}
    
}
    
