package task2;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import lombok.SneakyThrows;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    @SneakyThrows
    public static void sendMail(MailInfo mailInfo) {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("90d59d3bc9dcc36a2c2bc0cff3ec6208",
                "0ad18d475ed4ee71983f6d8d7ceeafc8", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
            .property(Emailv31.MESSAGES, new JSONArray()
                .put(new JSONObject()
                        .put(Emailv31.Message.FROM, new JSONObject()
                                .put("Email", "andrii.pletinka@ucu.edu.ua")
                                .put("Name", "Andrii"))
                        .put(Emailv31.Message.TO, new JSONArray()
                                .put(new JSONObject()
                                        .put("Email", mailInfo.getClient().getEmail())
                                        .put("Name", mailInfo.getClient().getName())))
                        .put(Emailv31.Message.SUBJECT, "Mail to " + mailInfo.getClient().getName())
                        .put(Emailv31.Message.TEXTPART, mailInfo.getMailCode().generate(mailInfo.getClient()))
                        .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger 1, welcome to <a href='https://www.mailjet.com/'>Mailjet</a>!</h3><br />May the delivery force be with you!")
                        .put(Emailv31.Message.CUSTOMID, "Lab11")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
