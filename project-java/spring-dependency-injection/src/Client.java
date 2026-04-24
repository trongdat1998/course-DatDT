public class Client implements InjectionMessage {

    /*
    // Nếu tôi muốn goi đến SMSService thì bắt buộc phải thay đổi code dưới. Liên kết giữa các class quá chặt chẽ
    // Vì vậy DI được thực thi

    private EmailService emailService = new EmailService();
    */
    private MessageService messageService;

    /*
    // Thực hiện DI qua Constructor Injection

    public Client(MessageService messageService){
        this.messageService = messageService;
    }
    */

    /*
    // Thực hiện DI qua  Setter Injection
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }
    */
    // Thực hiện DI qua Interface Injection bằng việc tạo mới file interface và class Client sẽ kế thừa nó

    @Override
    public void setService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }

}
