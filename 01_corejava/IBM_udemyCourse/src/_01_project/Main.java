package _01_project;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printScore();
    }
}
