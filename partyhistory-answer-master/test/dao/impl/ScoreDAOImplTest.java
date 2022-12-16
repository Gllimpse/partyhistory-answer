package dao.impl;

import entity.Score;
import junit.framework.TestCase;

public class ScoreDAOImplTest extends TestCase {
    static private ScoreDAOImpl sDAOImp = new ScoreDAOImpl();
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