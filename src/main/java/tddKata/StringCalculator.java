package tddKata;

public class StringCalculator {
    private static String nextLine="\n";
    private static String comma=",";
    private static String Or="|";
    public static String calculateSum(String... str){
        int sum=0;
        String response;
        for(String each:str){
            response=calculateSum(each);
            sum+=Integer.parseInt(response);
        }
        return String.valueOf(sum);
    }
    public static String calculateSum(String str){
        if(str.equals(""))
            return "0";
        int sum=add(str.split(nextLine+Or+comma));
        return String.valueOf(sum);
    }
    private static int add(String[] numbers){
        int sum=0;
        for(String number:numbers){
            int num=Integer.parseInt(number);
            sum+=num;
        }
        return sum;
    }
}
