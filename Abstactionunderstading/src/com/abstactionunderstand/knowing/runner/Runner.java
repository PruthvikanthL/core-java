package com.abstactionunderstand.knowing.runner;

import com.abstactionunderstand.knowing.external.*;

import com.abstactionunderstand.knowing.internal.*;

public class Runner {
    public static void main(String[] args) {
        JDBC oracleJDBC=new OracleJDBC();
        oracleJDBC.save();
        JDBC mySqlJDBC=new MySqlJDBC();
        mySqlJDBC.save();
        System.out.println("======Accessing the movie class=====");
        Movies movies=new Movies(mySqlJDBC);
        movies.showmovies();
        System.out.println("=====================================================================\n");
        System.out.println("1St Loose coupling example\n");
        System.out.println("Creating a copy of Circle and Rectangle implemented class for loose coupling");
        Shape shape=new Circle();
        System.out.println("This is while Drawingapp is accesing the circle");
        DrawingApp drawingApp=new DrawingApp(shape);
        drawingApp.drawingtool();
        Shape shape1=new Rectangle();
        System.out.println("This is while Drawingapp is accessing the Rectangle class");
        DrawingApp drawingApp1=new DrawingApp(shape1);
        drawingApp1.drawingtool();
        System.out.println("=====================================================================\n");
        System.out.println("2nd Loose coupling example\n");
        System.out.println("Creating a copy of Emailservice and SMS service implemented class for loose coupling");
        EmailService emailService=new EmailService();
        System.out.println("This is while notificationsender is accesing the emailservice");
        NotificationSender notificationSender=new NotificationSender(emailService);
        notificationSender.shownetwork();
        SMSService smsService=new SMSService();
        System.out.println("This is while notificationsender is accesing the SMSservice");
        NotificationSender notificationSender1=new NotificationSender(smsService);
        notificationSender1.shownetwork();
        System.out.println("=====================================================================\n");
        System.out.println("3rd Loose coupling example\n");
        System.out.println("Creating a copy of Mysqldatabase and Mangodb implemented class for loose coupling");
        MySQLDatabase mySQLDatabase=new MySQLDatabase();
        System.out.println("This is while Datamanager is accesing the Mysqldatabase");
        DataManager dataManager=new DataManager(mySQLDatabase);
        dataManager.showdata();
        MongoDB mongoDB=new MongoDB();
        System.out.println("This is while Datamanager is accesing the MongoDB");
        DataManager dataManager1=new DataManager(mongoDB);
        dataManager1.showdata();
        System.out.println("=====================================================================\n");
        System.out.println("4th Loose coupling example\n");
        System.out.println("Creating a copy of Car and Bike implemented class for loose coupling");
        Car car=new Car();
        System.out.println("This is while TransportSystem  is accesing the Car");
        TransportSystem transportSystem=new TransportSystem(car);
        transportSystem.searchvehicle();
        Bike bike=new Bike();
        System.out.println("This is while TransportSystem  is accesing the Bike");
        TransportSystem transportSystem1=new TransportSystem(bike);
        transportSystem1.searchvehicle();
        System.out.println("=====================================================================\n");
        System.out.println("5th Loose coupling example\n");
        System.out.println("Creating a copy of InkjetPrinter and LaserPrinter implemented class for loose coupling");
        InkjetPrinter inkjetPrinter=new InkjetPrinter();
        System.out.println("This is while Printmanager  is accesing the InkjetPrinter ");
        PrintManager printManager=new PrintManager(inkjetPrinter);
        printManager.chooseprinter();
        LaserPrinter laserPrinter=new LaserPrinter();
        System.out.println("This is while Printmanager  is accesing the LaserPrinter ");
        PrintManager printManager1=new PrintManager(laserPrinter);
        printManager1.chooseprinter();

    }
}
