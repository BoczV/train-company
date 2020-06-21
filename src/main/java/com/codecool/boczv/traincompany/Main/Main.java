package com.codecool.boczv.traincompany.Main;


import com.codecool.boczv.traincompany.Company.TrainCompany;
import com.codecool.boczv.traincompany.Trains.WithoutPassengers.Freight;
import com.codecool.boczv.traincompany.Trains.WithPassengers.IC;
import com.codecool.boczv.traincompany.Trains.WithPassengers.Passenger;

public class Main {
    public static void main(String[] args) {
        TrainCompany trainCompany = new TrainCompany();

        for (int i = 0; i < 2; i++) {
            trainCompany.registerTrain(new IC(1200));
            trainCompany.registerTrain(new Passenger(1000));
            trainCompany.registerTrain(new Freight(1000));
        }

        int profitOfCompany = trainCompany.calculateIncome(2);
        System.out.println(trainCompany.toString());
    }
}
