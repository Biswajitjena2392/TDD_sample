package tddKata;

public class StringCalculator {

    public static String calculateSum(String str){
        if(str.equals(""))
            return "0";
        String[] numbers= str.split(",");
        int sum=0;
        for(String number:numbers){
            int num=Integer.parseInt(number);
            sum+=num;
        }
        return String.valueOf(sum);
    }
}
