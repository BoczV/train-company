package com.codecool.boczv.traincompany.Trains.WithoutPassengers;

import com.codecool.boczv.traincompany.Trains.Train;
import com.codecool.boczv.traincompany.Util;

public abstract class TrainsWithPassengers extends Train {
    protected double ticketPriceOnline;
    protected double ticketPriceOnTrain;
    protected int chanceOfPunishment;
    protected static final double ratioOfPunishedPass = 0.20;
    protected static final int amountOfPunishment = 6;
    protected static final double ratioOfWhoBuyTicketOnline = 0.75;
    protected static final double ratioOfWhoBuyTicketOnTrain = 0.25;
    protected static final int numberOfDaysInMonth = 30;


    public TrainsWithPassengers(int monthlyCost) {
        super(monthlyCost);
    }

    public double getMonthlyRevenue() {
        double monthlyIncome = 0;
        int monthlyNumberOfPassengers = 0;
        for (int i = 0; i < numberOfDaysInMonth; i++){
            int dailyNumberOfPassengers = Util.randomNumberFromGivenRange(115, 251);
            monthlyIncome += (int)(dailyNumberOfPassengers * ratioOfWhoBuyTicketOnline) * ticketPriceOnline;
            monthlyIncome += (int)(dailyNumberOfPassengers * ratioOfWhoBuyTicketOnTrain) * ticketPriceOnTrain;
            monthlyNumberOfPassengers += dailyNumberOfPassengers;
        }
        monthlyIncome += calculatePunishment(monthlyNumberOfPassengers);
        return monthlyIncome;
    }

    private double calculatePunishment(int monthlyNumberOfPassengers){
        int randomNumber = Util.randomNumberFromGivenRange(1, 102);
        if(randomNumber <= chanceOfPunishment){
            return (int)(monthlyNumberOfPassengers * ratioOfPunishedPass) * amountOfPunishment;
        }
        return 0;
    }

}
