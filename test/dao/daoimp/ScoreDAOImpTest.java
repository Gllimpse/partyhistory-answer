package dao.daoimp;

import entity.Score;
import junit.framework.TestCase;

import java.sql.Timestamp;

public class ScoreDAOImpTest extends TestCase {
    static private ScoreDAOImp sDAOImp = new ScoreDAOImp();
    public void testSave() {
        sDAOImp.save(new Score(10,1, ""));
    }

    public void testUpdate() {
    }

    public void testGetScore() {
       Score score= sDAOImp.getScore(1);
       System.out.println(score.score+"   "+score.update_time);
    }
}