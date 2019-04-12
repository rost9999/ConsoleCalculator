public class Answer {


    public static double get_answer(String exp) {
        Rim newRim = new Rim();

        if (exp.indexOf("*") >= 0) {
            String Numbers[] = exp.split("\\*");
            double newAnswer = newRim.getInt(Numbers[0], 0) * newRim.getInt(Numbers[1], 0);
            return newAnswer;
        } else if (exp.indexOf("/") >= 0) {
            String Numbers[] = exp.split("\\/");
            double newAnser = newRim.getInt(Numbers[0], 0) / newRim.getInt(Numbers[1], 0);
            return newAnser;

        } else if (exp.indexOf("+") >= 0) {
            String Numbers[] = exp.split("\\+");
            double newAnswer = newRim.getInt(Numbers[0], 0) + newRim.getInt(Numbers[1], 0);
            return newAnswer;
        } else if (exp.indexOf("-") >= 0) {
            String Numbers[] = exp.split("\\-");
            double newAnswer = newRim.getInt(Numbers[0], 0) - newRim.getInt(Numbers[1], 0);
            return newAnswer;
        }
        return 0;
    }

}


