import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println(graycode(3));
    }
    public static ArrayList<String> graycode(int n){
        return  toGray(n);
    }
    public static ArrayList<String> toGray(int n)
    {
        if (n==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("0");
            ans.add("1");
            return ans;
        }
        ArrayList<String> s = toGray(n-1);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <s.size() ; i++) {
            ans.add("0"+s.get(i));
        }
        for (int i = s.size()-1; i>=0 ; i--) {
            ans.add("1"+s.get(i));
        }
        return ans;
    }
}
