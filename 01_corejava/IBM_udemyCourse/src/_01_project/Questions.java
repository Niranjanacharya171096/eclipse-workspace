package _01_project;

import java.util.Arrays;

public class Questions {
    private int id;
    private String question;
    private String[] options;
    private String answer;

    public Questions(int id, String question, String[] options, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
                + answer + "]";
    }
}