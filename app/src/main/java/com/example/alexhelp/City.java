package com.example.alexhelp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class City implements Parcelable {

    private int Index;

    protected City(Parcel in) {
        Index = in.readInt();
    }

    public City(int i) {
        Index =i;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Index);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<City> CREATOR = new Creator<City>() {
        @Override
        public City createFromParcel(Parcel in) {
            return new City(in);
        }

        @Override
        public City[] newArray(int size) {
            return new City[size];
        }
    };

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }






}
