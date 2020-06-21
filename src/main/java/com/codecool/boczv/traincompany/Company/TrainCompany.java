package com.codecool.boczv.traincompany.Company;

import com.codecool.boczv.traincompany.Trains.Train;

import java.util.HashSet;
import java.util.Set;

public class TrainCompany {
    private int profit = 0;
    private int income = 0;
    private int expenses = 0;
    private Set<Train> trains = new HashSet<Train>();

    public void registerTrain(Train train) {
        trains.add(train);
    }

    public int calculateIncome(int numberOfYears){
        for(int i = 0; i < numberOfYears * 12; i++){
            for(Train train: trains){
                income += train.getMonthlyRevenue();
                expenses += train.getMonthlyCost();
            }
        }
        profit += income - expenses;
        return profit;
    }

    @Override
    public String toString() {
        return "TrainCompany: " +
                "profit = " + profit +
                "$, income = " + income +
                "$, expenses = " + expenses +
                "$.";
    }
}
