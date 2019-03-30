package dev.karthi.github.fragments.Fragments;

public class Data {

    String id;
    String date1;
    String Date;
    String name;
    String Status;

    public Data(String customerID, String rasiedOn, String date,
                String raisedBy, String status) {
        id = customerID;
        date1 = rasiedOn;
        Date = date;
        name = raisedBy;
        Status = status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
