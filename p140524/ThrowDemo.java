
package pbo2301081003.p140524;

import pbo2301081003.p190324.MyException;

public class ThrowDemo {
    public static void main(String[] args) {
        String input = "Invalid Input";
        try {
            if(input.equals("Invalid Input")){
                throw new MyException("Input");
            } else {
                System.out.println(input);
            }
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
