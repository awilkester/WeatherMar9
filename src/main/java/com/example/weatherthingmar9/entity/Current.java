package com.example.weatherthingmar9.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@Getter
public class Current {

    @SerializedName("last_updated_epoch")
    @Expose
    public Integer lastUpdatedEpoch;
    @SerializedName("last_updated")
    @Expose
    public String lastUpdated;
    @SerializedName("temp_c")
    @Expose
    public Double tempC;
    @SerializedName("temp_f")
    @Expose
    public Double tempF;
    @SerializedName("is_day")
    @Expose
    public Integer isDay;
    @SerializedName("condition")
    @Expose
    public Condition condition;
    @SerializedName("wind_mph")
    @Expose
    public Double windMph;
    @SerializedName("wind_kph")
    @Expose
    public Double windKph;
    @SerializedName("wind_degree")
    @Expose
    public Integer windDegree;
    @SerializedName("wind_dir")
    @Expose
    public String windDir;
    @SerializedName("pressure_mb")
    @Expose
    public Double pressureMb;
    @SerializedName("pressure_in")
    @Expose
    public Double pressureIn;
    @SerializedName("precip_mm")
    @Expose
    public Double precipMm;
    @SerializedName("precip_in")
    @Expose
    public Double precipIn;
    @SerializedName("humidity")
    @Expose
    public Integer humidity;
    @SerializedName("cloud")
    @Expose
    public Integer cloud;
    @SerializedName("feelslike_c")
    @Expose
    public Double feelslikeC;
    @SerializedName("feelslike_f")
    @Expose
    public Double feelslikeF;
    @SerializedName("vis_km")
    @Expose
    public Double visKm;
    @SerializedName("vis_miles")
    @Expose
    public Double visMiles;
    @SerializedName("uv")
    @Expose
    public Double uv;
    @SerializedName("gust_mph")
    @Expose
    public Double gustMph;
    @SerializedName("gust_kph")
    @Expose
    public Double gustKph;
    @SerializedName("air_quality")
    @Expose
    public AirQuality airQuality;

}