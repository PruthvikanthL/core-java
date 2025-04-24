package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.MessageService;

public class NotificationSender {
    MessageService messageService;
    public NotificationSender(MessageService messageService){
        this.messageService=messageService;
    }
    public void shownetwork(){
        System.out.println("Running the shownetwork method in the NotificationSender");
        if(messageService!=null){
            messageService.networkprovider();
        }
        else{
            System.out.println("sorry messageservice is  null");
        }
    }
}
