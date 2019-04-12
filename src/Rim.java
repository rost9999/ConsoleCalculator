import java.io.Console;

public class Rim {
    public static double getInt(String num,int result){
        try{
            int newnum = Integer.parseInt(num);
            return newnum;
        }
        catch (NumberFormatException e){
            num = num.toUpperCase();
        }

        String total[][] = {{"900","CM"},{"1000","M"},{"400","CD"},{"500","D"},{"90","XC"},{"100","C"},{"40","XL"},{"50","L"},{"9","IX"},{"10","X"},{"4","IV"},{"5","V"},{"1","I"}};

        if (num.length() == 0){
            return result;
        }
        for (String t[] :total){
            if (num.indexOf(t[1]) >= 0){
                result += Integer.parseInt(t[0]);
                num = num.replaceFirst(t[1],"");
                return getInt(num,result);
            }

        }
        return getInt(num,result);

    }
}
