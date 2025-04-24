package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.MessageService;

public class EmailService implements MessageService {
    @Override
    public void networkprovider() {
        System.out.println("Runninng the networkprovider method in the Emailservice");
    }
}
