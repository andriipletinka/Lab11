package task2;

public class BirthdayMail implements MailCode {
    public static String TEMPLATE = "Happy Birthday, %Name!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%Name", client.getName());
    }
}
