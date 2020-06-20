package com.BoczV.TrainCo.Trains.Abstracts;

import java.util.Random;
import java.util.UUID;

public abstract class Train {
    protected final static Random random = new Random();
    protected UUID uniqueID;
    protected int monthlyCost;

    public Train(int monthlyCost){
        this.uniqueID = UUID.randomUUID();
        this.monthlyCost = monthlyCost;
    }

    public abstract double getMonthlyRevenue();

    public int getMonthlyCost() {
        return monthlyCost;
    }
}
