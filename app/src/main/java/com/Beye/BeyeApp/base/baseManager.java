package com.Beye.BeyeApp.base;

/**
 * Created by gald2 on 1/14/2016.
 */
public class baseManager {
    private static baseManager ourInstance = new baseManager();

    public static baseManager getInstance() {
        return ourInstance;
    }

    private baseManager() {
    }
}
