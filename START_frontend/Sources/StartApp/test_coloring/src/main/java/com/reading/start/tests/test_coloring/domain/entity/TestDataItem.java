package com.reading.start.tests.test_coloring.domain.entity;

import com.google.gson.annotations.SerializedName;

public class TestDataItem {
    public static final String FILED_X = "touch_x";
    public static final String FILED_Y = "touch_y";
    public static final String FILED_TOUCH_PRESSURE = "touch_pressure";
    public static final String FILED_TOUCH_SIZE = "touch_size";
    public static final String FILED_TIME = "time";
    public static final String FILED_COLOR = "color";
    public static final String FILED_DEVICE_X = "device_x";
    public static final String FILED_DEVICE_Y = "device_y";
    public static final String FILED_DEVICE_Z = "device_z";

    @SerializedName(FILED_X)
    private float mX;

    @SerializedName(FILED_Y)
    private float mY;

    @SerializedName(FILED_TOUCH_PRESSURE)
    private float mTouchPressure;

    @SerializedName(FILED_TOUCH_SIZE)
    private float mTouchSize;

    @SerializedName(FILED_TIME)
    private long mTime;

    @SerializedName(FILED_COLOR)
    private int mColor;

    @SerializedName(FILED_DEVICE_X)
    private float mDeviceX;

    @SerializedName(FILED_DEVICE_Y)
    private float mDeviceY;

    @SerializedName(FILED_DEVICE_Z)
    private float mDeviceZ;

    public TestDataItem(float x, float y, float touchPressure, float touchSize, long time, int color,
                        float deviceX, float deviceY, float deviceZ) {
        mX = x;
        mY = y;
        mTouchPressure = touchPressure;
        mTouchSize = touchSize;
        mTime = time;
        mColor = color;
        mDeviceX = deviceX;
        mDeviceY = deviceY;
        mDeviceZ = deviceZ;
    }

    public float getX() {
        return mX;
    }

    public void setX(float x) {
        mX = x;
    }

    public float getY() {
        return mY;
    }

    public void setY(float y) {
        mY = y;
    }

    public float getTouchPressure() {
        return mTouchPressure;
    }

    public void setTouchPressure(float touchPressure) {
        mTouchPressure = touchPressure;
    }

    public float getTouchSize() {
        return mTouchSize;
    }

    public void setTouchSize(float touchSize) {
        mTouchSize = touchSize;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        mColor = color;
    }

    public float getDeviceX() {
        return mDeviceX;
    }

    public void setDeviceX(float deviceX) {
        mDeviceX = deviceX;
    }

    public float getDeviceY() {
        return mDeviceY;
    }

    public void setDeviceY(float deviceY) {
        mDeviceY = deviceY;
    }

    public float getDeviceZ() {
        return mDeviceZ;
    }

    public void setDeviceZ(float deviceZ) {
        mDeviceZ = deviceZ;
    }
}