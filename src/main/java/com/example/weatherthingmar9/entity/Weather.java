package com.example.weatherthingmar9.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Getter
public class Weather {

    @SerializedName("location")
    @Expose
    public Location location;
    @SerializedName("current")
    @Expose
    public Current current;

}