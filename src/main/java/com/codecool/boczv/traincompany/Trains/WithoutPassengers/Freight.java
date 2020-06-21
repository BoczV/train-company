package com.codecool.boczv.traincompany.Trains.WithoutPassengers;

import com.codecool.boczv.traincompany.Trains.Train;
import com.codecool.boczv.traincompany.Util;

public class Freight extends Train {
    protected static final int revenue = 550;
    protected static final int chanceOfAbroadTour = 35;
    protected static final int extraRevenue = 110;

    public Freight(int monthlyCost) {
        super(monthlyCost);
    }

    public double getMonthlyRevenue() {
        return revenue + abroadRevenue();
    }

    private double abroadRevenue(){
        int randomNumber = Util.randomNumberFromGivenRange(1, 102);
        if(randomNumber <= chanceOfAbroadTour){
            return extraRevenue;
        }
        return 0;
    }
}
