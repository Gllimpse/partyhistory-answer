package entity;

public class Question {
    public int id;

    public String question;

    public String answer;

    public String rightAnswer;

    // 构造方法、getter 和 setter 省略
    public Question(int id,String question, String answer,String rightAnswer) {
        this.id=id;
        this.question=question;
        this.answer=answer;
        this.rightAnswer=rightAnswer;
    }
}
