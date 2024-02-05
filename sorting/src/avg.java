class avg {
    public static void main(String[] args) {
        int[] arr ={4000,3000,1000,2000};
        double ans =  average(arr);
        System.out.println(ans);


    }
    public static double average(int[] salary) {
        int max=salary[0], min=salary[0];
        int sum=0;
        int l=salary.length;
        for (int i = 0; i <salary.length ; i++) {
            sum+=salary[i];
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
        }
        return (double) (sum-min-max)/(l-2);
    }
}