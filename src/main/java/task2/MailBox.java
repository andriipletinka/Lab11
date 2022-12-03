package task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public MailBox() {
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo mailInfo: infos) {
            MailSender.sendMail(mailInfo);
        }
        infos.clear();
    }
}
