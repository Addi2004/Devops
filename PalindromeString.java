public class PalindromeString {
    public static boolean ispalindrome(String str){
        int n=str.length();
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir =path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
            int X2=x*x;
            int Y2=y*y;
            return (float)Math.sqrt(X2+Y2);
        
    }
    public static void main(String[] args) {
       // String str="kinshuk";
       // System.out.println(ispalindrome(str));
       String path="WNEENESENNN";
       System.out.println(getshortestpath(path));
    }
}
