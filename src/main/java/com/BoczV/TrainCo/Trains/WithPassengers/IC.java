package com.BoczV.TrainCo.Trains.WithPassengers;

import com.BoczV.TrainCo.Trains.Abstracts.TrainsWithPassengers;

public class IC extends TrainsWithPassengers {


    public IC(int monthlyCost) {
        super(monthlyCost);
        chanceOfPunishment = 8;
        ticketPriceOnline = 2;
        ticketPriceOnTrain = 4;
    }
}
