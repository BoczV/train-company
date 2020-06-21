package com.codecool.boczv.traincompany.Trains.WithPassengers;

import com.codecool.boczv.traincompany.Trains.WithoutPassengers.TrainsWithPassengers;

public class Passenger extends TrainsWithPassengers {


    public Passenger(int monthlyCost) {
        super(monthlyCost);
        chanceOfPunishment = 10;
        ticketPriceOnline = 1.5;
        ticketPriceOnTrain = 3.5;
    }

}
