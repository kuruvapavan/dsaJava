import java.util.HashMap;
import java.util.Map;

class romanToInt {
    public static void main(String[] args) {
        String roman = "III";
        System.out.println("The integer form of the Roman numeral " + roman + " is " + romanToInt(roman));
    }

    public static int romanToInt(String s) {
//        int num=0;
//        int i=0;
//        while (i<s.length()){
//            if (s.charAt(i)=='M'){
//                num=num+1000;
//            } else if (s.charAt(i)=='D') {
//                num+=500;
//            } else if (s.charAt(i)=='C') {
//                if (i+1<s.length() && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
//                    num=num-100;
//                }else {
//                    num+=100;
//                }
//            } else if (s.charAt(i)=='L') {
//                num+=50;
//            } else if (s.charAt(i)=='X') {
//                if (i+1<s.length() && (s.charAt(i+1)=='L' ||s.charAt(i+1)=='C')){
//                    num-=10;
//                }else {
//                    num+=10;
//                }
//            } else if (s.charAt(i)=='V') {
//                num+=5;
//            } else if (s.charAt(i) == 'I') {
//                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
//                    num -= 1; // Subtraction rule for 'I'
//                } else {
//                    num += 1;
//                }
//            }
//            i++;
//        }
//        return num;
       Map<Character,Integer> romanMap = new HashMap<>();
       romanMap.put('I',1);
       romanMap.put('V',5);
       romanMap.put('X',10);
       romanMap.put('L',50);
       romanMap.put('C',100);
       romanMap.put('D',500);
       romanMap.put('M',1000);
        System.out.println(romanMap);

       int ans =0;

        for (int i = 0; i <s.length() ; i++) {
            if (i<s.length()-1 && romanMap.get(s.charAt(i))<romanMap.get(s.charAt(i+1))){
                ans=ans-romanMap.get(s.charAt(i));
            }else {
                ans=ans+romanMap.get(s.charAt(i));
            }
        }

        return ans;
    }
}