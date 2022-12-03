package task2;

import task1.Gender;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrii", 18, "andrii.pletinka@ucu.edu.ua", Gender.MALE);
        MailInfo mailInfo1 = new MailInfo(client, new GiftMail());
        MailInfo mailInfo2 = new MailInfo(client, new BirthdayMail());
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);
        mailBox.sendAll();
    }
}
