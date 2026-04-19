//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();

        /*
        // Thực hiện DI qua Constructor Injection

        Client client = new Client(smsService);
        */

        /*
        // Thực hiện DI qua  Setter Injection

        Client client = new Client();
        client.setMessageService(emailService);
        */

        Client client = new Client();
        client.setService(emailService);

        client.processMessage("Hello Wold!");
    }
}