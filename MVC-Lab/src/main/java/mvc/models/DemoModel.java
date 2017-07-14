package mvc.models;


import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

/**
 * Created by Adrian.Flak on 6/27/2017.
 */

@Entity
public class DemoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer demoId;

    @Version
    private Integer version;

    private String userName;
    private String password;


    private String boxOne;
    private String boxTwo;
    private String boxThree;

    private String textArea;
    private String radioValue;
    private String selectOption;
    private String selectMultiple;

    public DemoModel(){}

    public Integer getDemoId() {
        return demoId;
    }

    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBoxOne() {
        return boxOne;
    }

    public void setBoxOne(String boxOne) {
        this.boxOne = boxOne;
    }

    public String getBoxTwo() {
        return boxTwo;
    }

    public void setBoxTwo(String boxTwo) {
        this.boxTwo = boxTwo;
    }

    public String getBoxThree() {
        return boxThree;
    }

    public void setBoxThree(String boxThree) {
        this.boxThree = boxThree;
    }

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    public String getRadioValue() {
        return radioValue;
    }

    public void setRadioValue(String radioValue) {
        this.radioValue = radioValue;
    }

    public String getSelectOption() {
        return selectOption;
    }

    public void setSelectOption(String selectOption) {
        this.selectOption = selectOption;
    }

    public String getSelectMultiple() {
        return selectMultiple;
    }

    public void setSelectMultiple(String selectMultiple) {
        this.selectMultiple = selectMultiple;
    }

}
