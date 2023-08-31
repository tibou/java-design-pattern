package miscellaneous.dependency_injection.junit;

import miscellaneous.dependency_injection.injection.Consumer;
import miscellaneous.dependency_injection.injection.MessageService;
import miscellaneous.dependency_injection.injection.MessageServiceInjector;
import miscellaneous.dependency_injection.injection.MyDIApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*

As you can see that I am using anonymous classes to mock the injector and service classes and I can easily test my application methods. I am using JUnit 4
for the above test class, so make sure it’s in your project build path if you are running above test class. We have used constructors to inject the
dependencies in the application classes, another way is to use a setter method to inject dependencies in application classes. For setter method dependency
injection, our application class will be implemented like below.

 */

public class MyDIApplicationJUnitTest {

    private MessageServiceInjector injector;
    @Before
    public void setUp(){
        //mock the injector with anonymous class
        injector = new MessageServiceInjector() {

            @Override
            public Consumer getConsumer() {
                //mock the message service
                return new MyDIApplication(new MessageService() {

                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock Message Service implementation");

                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

    @After
    public void tear(){
        injector = null;
    }

}