/**
* @author Solomnikov Mikhail <m.solomnikov@student.csn.khai.edu>
* @version 1.0
* @since 2020-09-30
*/
public class laba1 {
   
    public static void main(String[] args) {
           
        int variant = 18;
        String name = "Solomnikov Mikhail Pavlovich";
        String group = "535st1";
        
        System.out.printf("Group: %s\nName: %s\nVariant: %d \n", group, name, variant);
        String[] initials= {
        	"*** *   * ****",
        	"*   * * * *  *",
        	"*   *   * *  *",
        	"*** *   * *  *",
        };
        for (String s: initials){
        	System.out.println(s);
        }
    }
}