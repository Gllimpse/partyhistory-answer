package dao.impl;

import entity.User;
import junit.framework.TestCase;

public class UserDAOImplTest extends TestCase {
    static UserDAOImpl uDAOImp= new UserDAOImpl();

    public void testSave() {
        uDAOImp.save(new User(0,"root","123456"));
    }

    public void testUpdate() {
        uDAOImp.update(new User(1,"root","564789"));
    }

    public void testGetUserByAccount() {
        User user=uDAOImp.getUserByAccount("123");
        System.out.println(user.id+":"+user.account+":"+user.password);
    }
}