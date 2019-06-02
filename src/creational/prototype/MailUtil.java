package creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}发送地址为{1}的内容{2}";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getMail(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("保存了origin记录:" + mail.getContent());
    }
}
