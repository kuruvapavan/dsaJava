import java.util.Arrays;
import java.util.Comparator;

public class Comparsion {
    public static void main(String[] args) {
        String a = "pavan";
        String b ="pavan";
//        System.out.println(a==b);
//        String s1= "['Aaaa', 'Eeee', 'Ffff', 'Cccc', 'Dddd']";
//        System.out.print(s1);
//
//        String[] array = s1.split(",");
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i]);
//        };
        String str = "is2 sentence4 This1 a3";
        String[] words = str.split(" ");  // This splits the string into an array of words based on a space
        Arrays.sort(words, new Comparator<String>() {
            public int compare(String o1, String o2) {
                int num1=Integer.parseInt(o1.replaceAll("\\D",""));
                int num2=Integer.parseInt(o2.replaceAll("\\D",""));
                return Integer.compare(num1,num2);
            }
        });
        StringBuilder s = new StringBuilder();
        for (String st:
             words) {
            s.append(st,0,st.length()-1).append(" ");
            
        }
        String res = s.toString().trim();
        System.out.println(res);
//        System.out.println(Arrays.toString(words));



        String name1 = new String("Pavan");
        String name2= new String("Pavan");
//        System.out.println(name1==name2);


    }
}

