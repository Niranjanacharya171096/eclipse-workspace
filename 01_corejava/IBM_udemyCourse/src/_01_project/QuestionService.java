package _01_project;

import java.util.Scanner;

public class QuestionService {
    Questions[] ques = new Questions[5];
    int score = 0;

    public QuestionService() {
        ques[0] = new Questions(1, "size of boolean?", new String[] { "1", "2", "4", "8" }, "1");
        ques[1] = new Questions(2, "size of char?", new String[] { "1", "2", "4"}, "2");
        ques[2] = new Questions(3, "size of int?", new String[] { "1", "2", "4", "8" }, "4");
        ques[3] = new Questions(4, "size of double?", new String[] { "1", "2", "4", "8" }, "8");
        ques[4] = new Questions(5, "size of long?", new String[] { "1", "2", "4", "8" }, "8");
    }

    public void playQuiz() {
        for (Questions que : ques) {
            System.out.println(que);
            System.out.println("Question " + que.getId() + ". " + que.getQuestion());
            String[] options = que.getOptions();
            System.out.println("Options:");
            for (int i=0; i<(options.length); i++) {
                System.out.println(options[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Type Your answer = ");
            String userAns = sc.nextLine();
            if (userAns.equals(que.getAnswer())) {
                score++;
            }
            sc.close();
        }
    }

    public void printScore(){
        System.out.println("Your score is = "+score);
    }
}
