package com.astontech.bo;

import javax.persistence.*;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
@IdClass(ClientcontactPK.class)
public class Clientcontact extends BaseBo{
    private int clientContactid;
    private int clientid;
    private int entityTypeid;
    private Integer personid;

    @Basic
    @Column(name = "ClientContactid")
    public int getClientContactid() {
        return clientContactid;
    }

    public void setClientContactid(int clientContactid) {
        this.clientContactid = clientContactid;
    }

    @Id
    @Column(name = "Clientid")
    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    @Id
    @Column(name = "EntityTypeid")
    public int getEntityTypeid() {
        return entityTypeid;
    }

    public void setEntityTypeid(int entityTypeid) {
        this.entityTypeid = entityTypeid;
    }

    @Basic
    @Column(name = "Personid")
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clientcontact that = (Clientcontact) o;

        if (clientContactid != that.clientContactid) return false;
        if (clientid != that.clientid) return false;
        if (entityTypeid != that.entityTypeid) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientContactid;
        result = 31 * result + clientid;
        result = 31 * result + entityTypeid;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
