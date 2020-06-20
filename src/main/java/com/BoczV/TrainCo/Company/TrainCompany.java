package com.BoczV.TrainCo.Company;

import com.BoczV.TrainCo.Trains.Abstracts.Train;

import java.util.HashSet;
import java.util.Set;

public class TrainCompany {
    private int profit = 0;
    private int income = 0;
    private int expenses = 0;
    private Set<Train> trains = new HashSet<Train>();

    public void addTrainToRepo(Train train) {
        trains.add(train);
    }

    public void calculateTwoYearsIncome(){
        for(int i = 0; i < 24; i++){
            for(Train train: trains){
                income += train.getMonthlyRevenue();
                expenses += train.getMonthlyCost();
            }
        }
        profit += income - expenses;
        showResults();
    }


    private void showResults(){
        System.out.println("Income: " + income + "$");
        System.out.println("Expenses: " + expenses + "$");
        System.out.println("Profit: " + profit + "$");
    }


}
