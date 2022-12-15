package entity;

import java.sql.Timestamp;

public class Score {
    public int id;
    public int score;//得分
    public int userID; //用户id
    public String  update_time;//提交时间

    public Score(int id, int score, int userID, String update_time) {
        this.id = id;
        this.score = score;
        this.userID = userID;
        this.update_time = update_time;
    }

    public Score(int score, int userID, String update_time) {
        this.score = score;
        this.userID = userID;
        this.update_time = update_time;
    }
}
