package dao.daoimp;

import entity.User;
import junit.framework.TestCase;

public class UserDAOImpTest extends TestCase {
    static UserDAOImp uDAOImp= new UserDAOImp();

    public void testSave() {
        uDAOImp.save(new User(0,"root","123456"));
    }

    public void testUpdate() {
        uDAOImp.update(new User(1,"root","564789"));
    }

    public void testGetUserByAccount() {
        User user=uDAOImp.getUserByAccount("root");
        System.out.println(user.id+":"+user.account+":"+user.password);
    }
}