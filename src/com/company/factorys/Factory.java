package com.company.factorys;

public class Factory {
    private  String name;
    private  int factoryID;
    private double profit;

    public Factory() {
    }

    public Factory(String name, int factoryID, double profit) {
        this.name = name;
        this.factoryID = factoryID;
        this.profit = profit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(int factoryID) {
        this.factoryID = factoryID;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
