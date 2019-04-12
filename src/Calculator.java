class Calculator {

    public static void main(String[] args) {
        Answer Answer = new Answer();
        while (true) {
            System.out.print("Please type expression: ");
            String input = System.console().readLine();
            System.out.println(Answer.get_answer(input));


        }
    }
}


