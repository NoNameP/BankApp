package com.Gomes;

public interface IBaseRate {
    //Method to return Interest Rate
    default double getBaseRate() {
        return 2.5;
    }
}
