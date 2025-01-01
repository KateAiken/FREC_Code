import java.util.Scanner;
public class FREC_Class {
    public String getOption(Scanner input){
        while (true){
            System.out.print("\nMenu \nTo play press p\nTo see FREC types press f \nTo read instructions press i\nTo quit press q\nEnter Letter:");
            String choice = input.nextLine();
            if (choice.equals("q") || choice.equals("p") || choice.equals("i") || choice.equals("f")){
                return (choice);}
            else{ System.out.print("That is not a valid selection. Enter New Selection: ");}
        }}
    public void printQuestion(int num){
        String[] questions = {"1. Whats your favourite O-week day?", "2. Thoughts on running in a chain?", "3. What\'s your favourite thing to do at a party?", "4. What would you do to your hair?", "5. How tall is the pole?", "6. How much do you love Dean Deluzio?", "7. How did you do in Physics?", "8. Are you going to fail 112?", "9. What was the first bar you got?", "10. “We love FC, We Love FC, we Love FC” Did you start dancing?"};
        String[][] answers = {{"a) \"Wednesday\"", "b) Thundermugz ", "c) Highlands", "d) Pole Day"},{"a) It was so fun!", "b) Hell No!", "c) After \"Wednesday\"", "d) It keeps everyone organized"},{"a) Just Chat", "b) Beer Pong", "c) Keg Stand", "d) Dance"},{"a) Skull/bones", "b) Flowers", "c) Just Colour", "d) Cardboard"},{"a) Sooooo Tall", "b) Taller than the sky", "c) Short enough to climb on my own", "d) Ill check the O-week bible"},{"a) Sooooo Much", "b) His dog is sooooo cute", "c) Who?", "d) I'm a FREC, I dont have to answer a \"how\" question"},{"a) Rocket it!", "b) Passed it", "c) Bombed it", "d) Failed it"},{"a) ...maybe", "b) Definitely", "c) I already started Studying", "d) Wait, is that this semester?"},{"a) Wizard", "b) Ladder Committee", "c) Harcore or Evolution", "d) Cuffed"},{"a) YES!", "b) I wish", "c) What does that mean", "d) It's not O-Week"}};
        System.out.println("\n"+ questions[num]);   
        for(int i = 0; i < 4; i++){
            System.out.println(answers[num][i]);
        }
        System.out.print("Answer: ");
    }
    public String getAns(Scanner answer){
        while (true){
            String ans = answer.nextLine();
            if (ans.equals("a") || ans.equals("b") || ans.equals("c") || ans.equals("d")){
                return (ans);
            }
            else{ System.out.print("That is not a valid selection. Enter New Selection: ");}
        }}
    public int calculate(String[] quizAnswers){
        String [][] key = {{"b", "d", "x", "a", "d", "x", "b", "c", "d", "b"},{"a", "c", "x", "b", "a", "a", "x", "a", "d", "c"},{"b", "x", "a", "c", "x", "b", "a", "c", "b", "b"},{"c", "a", "b", "a", "b", "a", "x", "x", "c", "b"},{"x", "b", "c", "x", "c", "c", "d", "d", "a", "d"},{"d", "a", "d", "d", "x", "d", "c", "b", "x", "a"}};
        int[] answerCount = new int[7];
        for (int col = 0; col < 10; col ++){
            for (int row = 0; row < 6; row++){
                if (quizAnswers[col].equals(key[row][col])){
                    answerCount[row]++;
                }}}
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < 6; i++){
            if (answerCount[i] > max){
                max = answerCount[i];
                maxIndex = i;
            }}
        return maxIndex;
    }
    public void printFREC(int num){
        String[][] FREC =  {{"Tech FREC", "The tech FREC is key to the organization of O-week, \ncarrying the FREC bible and making sure the group is \nalways where they need to be."},{"Plant", "The plant is the best kept secret of O-week (for a day and \na half at least), they make sure the first years are \ncomfortable and help them gain a bit of confidence."},{"Sober FREC", "Sober FREC is not an official role but keeps everyone \nsafe at the tea party, they are incharge of making sure \neveryone gets home safetly"},{"Hardcore/Action FREC", "The hardcore or action FREC is in charge of \nthe fun, they make sure that all the first years are \ninvolved and of course lead the chain"},{"Cocky First Year", "The cocky first year was created by group 32 to \nname some first years that got a bit to confident, if \nyou got to cocky with your quiz answers unfortunately thats who you are"},{"Frec Committee", "The FC is a the group of amazing people that run \nO-week and keep all the rest of the crazy FRECS organized"}};
        if (num == 7){
            for (int i = 0; i < 6; i ++){
                System.out.println("\n" + FREC[i][0] + "\n" + FREC[i][1]);
            }}
        else{
            System.out.println(FREC[num][0]+ "\nAbout: "+ FREC[num][1]);
        }}
    public void instructions(){
        System.out.print("\nInstructions\nPress p then enter to start the questionaire\nAnswer each question by entering the letter (Ex. a) and pressign  enter\nOnce you reach the end of the questions your result and the menu will appear again");
    }
}