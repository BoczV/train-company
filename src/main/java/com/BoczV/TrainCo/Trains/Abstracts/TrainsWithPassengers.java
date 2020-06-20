package com.BoczV.TrainCo.Trains.Abstracts;

public abstract class TrainsWithPassengers extends Train {
    protected double ticketPriceOnline;
    protected double ticketPriceOnTrain;
    protected int chanceOfPunishment;
    protected final double ratioOfPunishedPass = 0.20;
    protected final int amountOfPunishment = 6;


    public TrainsWithPassengers(int monthlyCost) {
        super(monthlyCost);
    }

    public double getMonthlyRevenue() {
        double monthlyIncome = 0;
        int monthlyNumberOfPassengers = 0;
        for (int i = 0; i < 30; i++){
            int dailyNumberOfPassengers = 115 + random.nextInt(136);
            monthlyIncome += (int)(dailyNumberOfPassengers * 0.75) * ticketPriceOnTrain;
            monthlyIncome += (int)(dailyNumberOfPassengers * 0.25) * ticketPriceOnline;
            monthlyNumberOfPassengers += dailyNumberOfPassengers;
        }
        monthlyIncome += calculatePunishment(monthlyNumberOfPassengers);
        return monthlyIncome;
    }

    private double calculatePunishment(int monthlyNumberOfPassengers){
        int randomNumber = 1 + random.nextInt(101);
        if(randomNumber <= chanceOfPunishment){
            return (int)(monthlyNumberOfPassengers * ratioOfPunishedPass) * amountOfPunishment;
        }
        return 0;
    }

}
