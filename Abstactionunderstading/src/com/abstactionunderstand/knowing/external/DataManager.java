package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.Database;

public class DataManager {
    Database database;
    public DataManager(Database database){
        this.database=database;
    }
    public void showdata(){
        System.out.println("Running the showdata method in Datamanager");
        if(this.database!=null){
           this.database.data();
        }
        else
        {
            System.out.println("sorry database is null");
        }
    }
}
