import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiffWaysToAddParentheses {
    public static void main(String[] args) {
        String str = "2*3-4*5";
        System.out.println(diffWaysToCompute(str));
    }
    public static List<Integer> diffWaysToCompute(String expression){
        HashMap<String,List<Integer>> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<expression.length();i++)
        {
            char ch = expression.charAt(i);
            if(ch=='+'||ch=='-'|| ch=='*'){
                List<Integer> left = map.getOrDefault(expression,diffWaysToCompute(expression.substring(0,i)));
                List<Integer> right = map.getOrDefault(expression,diffWaysToCompute(expression.substring(i+1)));

                System.out.println("For expression: " + expression + " at index " + i + " (" + ch + ")");
                System.out.println("Left (" + expression.substring(0, i) + "): " + left);
                System.out.println("Right (" + expression.substring(i + 1) + "): " + right);
                for(Integer c1 : left){
                    for(Integer c2 : right){
                        if(ch=='+'){
                            res.add(c1+c2);
                        }
                        else if(ch=='-'){
                            res.add(c1-c2);
                        }
                        else if(ch=='*'){
                            res.add(c1*c2);
                        }
                    }
                }
            }
        }
        if(res.size()==0)res.add(Integer.parseInt(expression));
        map.put(expression,res);
        return res;
    }
}
