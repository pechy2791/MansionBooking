package com.droiddev.mansionbooking.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelPostRatePrice {

    @SerializedName("min")
    @Expose
    private String min;
    @SerializedName("max")
    @Expose
    private String max;

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

}
