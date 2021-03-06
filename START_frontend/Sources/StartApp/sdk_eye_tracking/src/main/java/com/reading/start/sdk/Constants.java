package com.reading.start.sdk;

import com.reading.start.sdk_eye_tracking.BuildConfig;
import com.reading.start.sdk_eye_tracking.R;

import java.text.DecimalFormat;

/**
 * Contains all constants eye-tracking sdk.
 */
public class Constants {

    // ----------- Camera constants -----------

    public static final int CAMERA_INDEX = BuildConfig.CAMERA_INDEX;

    public static final int CAMERA_WIDTH = BuildConfig.CAMERA_WIDTH;

    public static final int CAMERA_HEIGHT = BuildConfig.CAMERA_HEIGHT;

    // ----------- Detecting algorithm constants -----------

    public static final int CALIBRATE_DELAY = 4000;

    public static final int POST_CALIBRATE_DELAY = 10000;

    public static final double THRESHOLD_VERTICAL = 0.15;

    public static final double THRESHOLD_HORIZONTAL = 0.15;

    public static final double GAZE_OUTSIZE_VALUE_X = 6;

    public static final double GAZE_OUTSIZE_VALUE_Y = 6;

    public static final int CENTER_AREA_SIZE = 50;

    public static final int LEFT_AREA_SIZE = 30;

    public static final int RIGHT_AREA_SIZE = 30;

    public static final double VERTICAL_CALIBRATION_OFFSET = -0.12;

    public static final int CALIBRATE_FAIL_OFFSET_X = 20;

    public static final int CALIBRATE_FAIL_OFFSET_Y = 20;

    public static final int CALIBRATE_FACE_LIST_SIZE = 10;

    public static final int CALIBRATE_PUPIL_LIST_SIZE = 10;

    public static final int CALIBRATE_EYE_LIST_SIZE = 10;

    public static final int POINTS_LIST_SIZE = 1;

    public static final int FACE_LIST_SIZE = 5;

    public static final int DEFAULT_PUPIL_AREA_SIZE = 40;

    public static final int POST_PROCESS_PUPIL_AREA_SIZE = 40;

    public static final double DEFAULT_CONTRAST = 1.5; //[1.0-3.0];

    public static final double DEFAULT_BRIGHTNESS = 0; //[0-100];

    public static final int MIN_BRIGHTNESS_LEVEL = 100;

    public static final int PREFERRED_BRIGHTNESS_LEVEL = 220;

    public static final int MIN_FACE_AREA = 15;

    public static final int MAX_FACE_AREA = 25;

    public static final int LIGHT_THRESHOLD_LUX = 25;

    public static final float DEVICE_POSITION_X_THRESHOLD = 1;

    public static final float SHAKE_THRESHOLD = 20;

    // ----------- Resources for detecting -----------

    public static final int FACE_DETECT_RAW = R.raw.haarcascade_frontalface_default;

    public static final int EYE_LEFT_DETECT_RAW = R.raw.haarcascade_lefteye_2splits;

    public static final int EYE_RIGHT_DETECT_RAW = R.raw.haarcascade_righteye_2splits;

    public static final String FACE_DETECT_FILE = "face.xml";

    public static final String EYE_LEFT_DETECT_FILE = "eye_left.xml";

    public static final String EYE_RIGHT_DETECT_FILE = "eye_right.xml";

    // ----------- General app constants -----------

    public static final String VIDEO_FILE_NAME = "sdk_video.mp4";

    public static final String VIDEO_FILE_PREFIX_TEMP_CALIBRATION = "temp_calibration_";

    public static final String VIDEO_FILE_PREFIX_TEMP_POST_CALIBRATION = "temp_post_calibration_";

    public static final String VIDEO_FILE_PREFIX_TEMP_TEST = "temp_test_";

    public static final boolean ENABLE_VIDEO_RECORDING = true;

    public static final boolean ENABLE_TIME_STAMP_ON_VIDEO = true;
}