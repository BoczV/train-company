package com.BoczV.TrainCo.Trains.WithoutPassengers;

import com.BoczV.TrainCo.Trains.Abstracts.Train;

public class Freight extends Train {
    protected final int revenue = 550;

    public Freight(int monthlyCost) {
        super(monthlyCost);
    }

    public double getMonthlyRevenue() {
        return revenue + abroadRevenue();
    }

    private double abroadRevenue(){
        int randomNumber = 1 + random.nextInt(101);
        if(randomNumber <= 35){
            return 110;
        }
        return 0;
    }
}
