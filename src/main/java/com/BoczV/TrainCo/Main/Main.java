package com.BoczV.TrainCo.Main;


import com.BoczV.TrainCo.Company.TrainCompany;
import com.BoczV.TrainCo.Trains.WithoutPassengers.Freight;
import com.BoczV.TrainCo.Trains.WithPassengers.IC;
import com.BoczV.TrainCo.Trains.WithPassengers.Passenger;

public class Main {
    public static void main(String[] args) {
        TrainCompany trainCompany = new TrainCompany();

        for (int i = 0; i < 2; i++) {
            trainCompany.addTrainToRepo(new IC(1200));
            trainCompany.addTrainToRepo(new Passenger(1000));
            trainCompany.addTrainToRepo(new Freight(1000));
        }

        trainCompany.calculateTwoYearsIncome();
    }
}
