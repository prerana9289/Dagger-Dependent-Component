package com.hariofspades.dagger2advanced.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class DateFormatter {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("age")
    @Expose
    private String age;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
