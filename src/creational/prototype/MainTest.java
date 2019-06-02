package creational.prototype;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Mail mail = new Mail();
//        mail.setContent("初始化模板");
//        for (int i = 0; i < 5; i++) {
//            mail.setContent("恭喜中奖"+i);
//            mail.setMail(i+"@qq.com");
//            mail.setName(i+"先生");
//            MailUtil.sendMail(mail);
//        }
//        MailUtil.saveOriginMailRecord(mail);
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 5; i++) {
            Mail tempMail = (Mail) mail.clone();
            tempMail.setContent("恭喜中奖" + i);
            tempMail.setMail(i + "@qq.com");
            tempMail.setName(i + "先生");
            MailUtil.sendMail(tempMail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
