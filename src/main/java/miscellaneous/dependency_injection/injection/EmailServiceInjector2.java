package miscellaneous.dependency_injection.injection;

public class EmailServiceInjector2 implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication2 app = new MyDIApplication2();
        app.setService(new EmailServiceImpl());
        return app;
    }

}