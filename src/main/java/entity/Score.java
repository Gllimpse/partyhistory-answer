package entity;

public class Score {
    public int id;
    public int score;
    public int userID;
    public String update_time;

    public Score(int id, int score, int userID,String update_time) {
        this.id=id;
        this.score=score;
        this.userID=userID;
        this.update_time=update_time;
    }
}
