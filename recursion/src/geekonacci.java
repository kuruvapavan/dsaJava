public class geekonacci {
    public static void main (String[] args) {
        //code
        System.out.println( gino(1,3,2,5));
    }
    static int gino(int a, int b, int c, int n){
        if(n==1){
            return a;
        }
        if(n==2){
            return b;
        }
        if(n==3){
            return c;
        }
        else{
            return gino(a,b,c,n-1)+gino(a,b,c,n-2)+gino(a,b,c,n-3);
        }
    }
}
