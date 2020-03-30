package com.dicoding.fransdedypasaribu.mysubmissionapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Alat implements Parcelable {
    private String name;
    private String from;
    private String photo;

    protected Alat(Parcel in) {
        name = in.readString();
        from = in.readString();
        photo = in.readString();
    }

    public Alat() {

    }

    public static final Creator<Alat> CREATOR = new Creator<Alat>() {
        @Override
        public Alat createFromParcel(Parcel in) {
            return new Alat(in);

        }

        @Override
        public Alat[] newArray(int size) {
            return new Alat[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(from);
        parcel.writeString(photo);
    }
}
