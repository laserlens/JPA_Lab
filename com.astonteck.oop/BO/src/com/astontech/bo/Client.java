package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Client extends BaseBo {
    private int clientid;
    private String clientName;
    private Date createDate;

    //constructor

    public Client(){}

    public Client(String clientName, Date createDate){
        this.setClientName(clientName);
        this.setCreateDate(createDate);
    }



    @Id
    @Column(name = "Clientid")
    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    @Basic
    @Column(name = "ClientName")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "CreateDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientid != client.clientid) return false;
        if (clientName != null ? !clientName.equals(client.clientName) : client.clientName != null) return false;
        if (createDate != null ? !createDate.equals(client.createDate) : client.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientid;
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
