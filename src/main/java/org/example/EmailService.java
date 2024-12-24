package org.example;

import com.mailersend.sdk.MailerSend;
import com.mailersend.sdk.MailerSendResponse;
import com.mailersend.sdk.emails.Email;
import com.mailersend.sdk.exceptions.MailerSendException;

public class EmailService {

    public static void sendEmail(EmailMessage emailMessage) {

        Email email = new Email();

        email.setFrom("Consultancy App", "dariussspam@trial-yzkq3409rnx4d796.mlsender.net");
        email.addRecipient("", emailMessage.getReceiver());

        email.setSubject("Confirmation email");

        email.setPlain(emailMessage.getMessage());

        MailerSend ms = new MailerSend();

        ms.setToken("mlsn.1b31464eae927682d5d2a76277a677b72b17eb727d3952d673029a5235463ed7");

        try {

            MailerSendResponse response = ms.emails().send(email);
            System.out.println("Confirmation email is sent");
        } catch (MailerSendException e) {
            e.printStackTrace();
        }
    }

}
