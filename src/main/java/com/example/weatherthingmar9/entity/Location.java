package com.example.weatherthingmar9.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Getter
public class Location {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("region")
    @Expose
    public String region;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("lat")
    @Expose
    public Double lat;
    @SerializedName("lon")
    @Expose
    public Double lon;
    @SerializedName("tz_id")
    @Expose
    public String tzId;
    @SerializedName("localtime_epoch")
    @Expose
    public Integer localtimeEpoch;
    @SerializedName("localtime")
    @Expose
    public String localtime;

}