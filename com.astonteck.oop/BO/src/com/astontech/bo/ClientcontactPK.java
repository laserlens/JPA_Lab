package com.astontech.bo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
public class ClientcontactPK implements Serializable{
    private int clientid;
    private int entityTypeid;

    @Column(name = "Clientid")
    @Id
    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    @Column(name = "EntityTypeid")
    @Id
    public int getEntityTypeid() {
        return entityTypeid;
    }

    public void setEntityTypeid(int entityTypeid) {
        this.entityTypeid = entityTypeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientcontactPK that = (ClientcontactPK) o;

        if (clientid != that.clientid) return false;
        if (entityTypeid != that.entityTypeid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientid;
        result = 31 * result + entityTypeid;
        return result;
    }
}
