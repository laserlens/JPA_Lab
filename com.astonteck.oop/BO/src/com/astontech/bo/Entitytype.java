package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Entitytype extends BaseBo {

    //region Properties
    private int entityId;
    private String entityName;
    private String entityType;
    private String entityTypeName;
    private Integer entityTypeid;
    //endregion

    //region getters and Setters
    @Id
    @Column(name = "EntityID")
    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    @Basic
    @Column(name = "EntityName")
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Basic
    @Column(name = "EntityType")
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Basic
    @Column(name = "EntityTypeName")
    public String getEntityTypeName() {
        return entityTypeName;
    }

    public void setEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }

    @Basic
    @Column(name = "EntityTypeid")
    public Integer getEntityTypeid() {
        return entityTypeid;
    }

    public void setEntityTypeid(Integer entityTypeid) {
        this.entityTypeid = entityTypeid;
    }

    //helper method/getter

    public String getNameAndType(){return entityName + " " + getEntityTypeName();}
    //endregion

    //region constructors
    public Entitytype() {}

    public Entitytype(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }

    //endregion

    //example of override from basebo
    public String overRideThisMethod(){
        return "sub method that overides";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entitytype that = (Entitytype) o;

        if (entityId != that.entityId) return false;
        if (entityName != null ? !entityName.equals(that.entityName) : that.entityName != null) return false;
        if (entityType != null ? !entityType.equals(that.entityType) : that.entityType != null) return false;
        if (getEntityTypeName() != null ? !getEntityTypeName().equals(that.getEntityTypeName()) : that.getEntityTypeName() != null)
            return false;
        if (entityTypeid != null ? !entityTypeid.equals(that.entityTypeid) : that.entityTypeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entityId;
        result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + (getEntityTypeName() != null ? getEntityTypeName().hashCode() : 0);
        result = 31 * result + (entityTypeid != null ? entityTypeid.hashCode() : 0);
        return result;
    }
}
