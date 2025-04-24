package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.JDBC;

public class Movies {
    JDBC jdbc;
    public Movies(JDBC jdbc){
        this.jdbc=jdbc;
    }
    public void showmovies(){
        System.out.println("Running the show movies method");
        if(this.jdbc!=null){
            this.jdbc.save();
        }
        else{
            System.err.println("Sorry JDBC is null cant show the movie!....");
        }
    }
}
