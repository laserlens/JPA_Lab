package com.astontech.bo;

/**
 * Created by Adrian.Flak on 5/16/2017.
 */
public class BaseBo {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String overRideThisMethod() {
        return "override this string";
    }
}
