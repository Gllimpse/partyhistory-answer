package service.impl;

import factory.ServiceFactory;
import junit.framework.TestCase;

public class UserServiceImplTest extends TestCase {

    public void testIsTodayAnswered() {
        Boolean hasAnswer=ServiceFactory.getUserService().isTodayAnswered("root");
        System.out.println(hasAnswer);
    }

    public void testSubmitScore() {
    }
}