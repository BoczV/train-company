package com.BoczV.TrainCo.Trains.WithPassengers;

import com.BoczV.TrainCo.Trains.Abstracts.TrainsWithPassengers;

public class Passenger extends TrainsWithPassengers {


    public Passenger(int monthlyCost) {
        super(monthlyCost);
        chanceOfPunishment = 10;
        ticketPriceOnline = 1.5;
        ticketPriceOnTrain = 3.5;
    }

}
