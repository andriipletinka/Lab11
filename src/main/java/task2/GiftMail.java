package task2;

public class GiftMail implements MailCode {
    public static String TEMPLATE = "Black Friday! %Name, buy!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%Name", client.getName());
    }
}
