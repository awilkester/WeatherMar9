package com.example.weatherthingmar9.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Getter
public class Condition {

    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("icon")
    @Expose
    public String icon;
    @SerializedName("code")
    @Expose
    public Integer code;

}