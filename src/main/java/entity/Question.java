package entity;

public class Question {
    public int id;
    public String question;
    public String answer;
    public char rightAnswer;

    public Question(int id, String question, String answer, char rightAnswer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.rightAnswer = rightAnswer;
    }

}
