/**
  *Rod Cutting problem with recursive approach
  * 
  *Muhammed Serhan Genis
  *13.08.2022
  *
*/
public class Main {
    
    
    public static int cutRod(Integer []prices,int length){
        
        int maxProfit=-1;
        if(length==0){
            return 0;
        }
        for (int i = 1; i <=length; i++) {
            
            maxProfit=Math.max(maxProfit, prices[i-1]+cutRod(prices, length-i));
        }

        return maxProfit ;
    } 
    
    public static void main(String args[]){
        
        Integer [] prices={1,5,8,9,10,17,17,20,24,25} ;//prices corresponding to the length of the rod. (length=1,price=1),(length=5,price=10)...
        int rodLength=prices.length;
        
        System.out.println("The maximum profit= "+cutRod(prices,rodLength));
        
    }
    
}
