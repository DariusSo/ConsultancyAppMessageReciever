package org.example;

public class Main {
    public static void main(String[] args) {
        Thread confirmationEmails = new Thread(new RabbitMQService());
        confirmationEmails.start();

    }
}