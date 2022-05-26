package pacade;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("from");
        emailMessage.setTo("to");
        emailMessage.setSubject("subject");
        emailMessage.setText("text");

        emailSender.sendEmail(emailMessage);
    }
}
