package com.astontech.bo.interfaces;


/**
 * Created by Adrian.Flak on 5/22/2017.
 */
public class Site implements ILocation {

    //region Properties
    private int ConferenceRoooms;
    private int Offices;
    private int Cubicles;
    private int TrainingDesks;
    private int CoffeeMachines;
    private String SiteName;
    //endregion

    //region getters/setters
    public int getConferenceRoooms() {
        return ConferenceRoooms;
    }

    public void setConferenceRoooms(int conferenceRoooms) {
        ConferenceRoooms = conferenceRoooms;
    }

    public int getOffices() {
        return Offices;
    }

    public void setOffices(int offices) {
        Offices = offices;
    }

    public int getCubicles() {
        return Cubicles;
    }

    public void setCubicles(int cubicles) {
        Cubicles = cubicles;
    }

    public int getTrainingDesks() {
        return TrainingDesks;
    }

    public void setTrainingDesks(int trainingDesks) {
        TrainingDesks = trainingDesks;
    }

    public int getCoffeeMachines() {
        return CoffeeMachines;
    }

    public void setCoffeeMachines(int coffeeMachines) {
        CoffeeMachines = coffeeMachines;
    }

    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String siteName) {
        SiteName = siteName;
    }
    //endregion

    //region Interface Overrides
    @Override
    public int numberOfWorkSpaces (){
        return (this.Cubicles + this.Offices + this.TrainingDesks);
    }

    @Override
    public boolean canHaveMeetings(){
      return (this.ConferenceRoooms > 0 );
    }

    @Override
    public String getLocationName(){
        return this.SiteName;
    }

    @Override
    public boolean hasCoffee(){
        return (this.CoffeeMachines > 0);
    }
    //endregion

}

