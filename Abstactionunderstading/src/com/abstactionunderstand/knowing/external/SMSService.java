package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.MessageService;

public class SMSService implements MessageService {
    @Override
    public void networkprovider() {
        System.out.println("Running the networkprovider method in the SMSService class");
    }
}
