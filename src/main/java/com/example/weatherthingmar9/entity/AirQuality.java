package com.example.weatherthingmar9.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Getter
public class AirQuality {

    @SerializedName("co")
    @Expose
    public Double co;
    @SerializedName("no2")
    @Expose
    public Double no2;
    @SerializedName("o3")
    @Expose
    public Double o3;
    @SerializedName("so2")
    @Expose
    public Double so2;
    @SerializedName("pm2_5")
    @Expose
    public Double pm25;
    @SerializedName("pm10")
    @Expose
    public Double pm10;
    @SerializedName("us-epa-index")
    @Expose
    public Integer usEpaIndex;
    @SerializedName("gb-defra-index")
    @Expose
    public Integer gbDefraIndex;

}