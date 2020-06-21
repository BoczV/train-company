package com.codecool.boczv.traincompany.Trains.WithPassengers;

import com.codecool.boczv.traincompany.Trains.WithoutPassengers.TrainsWithPassengers;

public class IC extends TrainsWithPassengers {


    public IC(int monthlyCost) {
        super(monthlyCost);
        chanceOfPunishment = 8;
        ticketPriceOnline = 2;
        ticketPriceOnTrain = 4;
    }
}
