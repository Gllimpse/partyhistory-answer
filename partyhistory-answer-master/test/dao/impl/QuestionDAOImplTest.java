package dao.impl;


import entity.Question;
import junit.framework.TestCase;

import java.util.List;

public class QuestionDAOImplTest extends TestCase {

    //测试获取问题数据
    public void testGetQuestions() {
        QuestionDAOImpl qDAOImp=new QuestionDAOImpl();
        List<Question> questions=qDAOImp.getQuestions(null);

        for(Question q:questions) {
            System.out.println(q.question);
            System.out.println(q.answer);
            System.out.println(q.rightAnswer);
        }
    }
}