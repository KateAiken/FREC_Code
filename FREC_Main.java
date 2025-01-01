import java.util.Scanner;
public class FREC_Main{
    public static void main(String[] args) {
        FREC_Class quiz = new FREC_Class();
        System.out.println("What FREC are you?");
        Scanner input = new Scanner(System.in);
        String command = quiz.getOption(input);
        while(!command.equals("q")){
            if (command.equals("i")){
                quiz.instructions();
                command = quiz.getOption(input);
            }
            if (command.equals("f")){
                quiz.printFREC(7);
                command = quiz.getOption(input);
            }
            String playerAnswer[] = new String[10];
            for (int quizNum = 0; quizNum < 10; quizNum ++){
                quiz.printQuestion(quizNum);
                playerAnswer[quizNum] = quiz.getAns(input);
            }
            quiz.printFREC(quiz.calculate(playerAnswer));
            command = quiz.getOption(input);
        }
        input.close();
    }
}