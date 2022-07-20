/*

Suppose you have given the following line of code:
int a[3] = {2, 3, 4, 5}
If the above line has an exception then handle it with the java throws keyword.


 */

public class exception_throws {
    
    public static void arrg() throws Exception{
        int a[3] = {2, 3, 4, 5};        
    }

    public static void main(String[] args) {
       
        try{
            arrg();
        }
        catch(Exception e){
            System.out.println("not correct args input");
        }
        
        
    }
}
