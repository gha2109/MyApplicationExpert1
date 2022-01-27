package com.meriem.myapplicationexpert.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.sql.Date;

@Entity
public class contrats {
    @PrimaryKey(autoGenerate = true)
    private int  id ;
    @TypeConverters({Converter.class})
    private Date datedebut ;
    @TypeConverters({Converter.class})
    private Date datefin ;
    private Float redevence ;
    private int valsync ;

    public contrats(int id, Date datedebut, Date datefin, Float redevence, int valsync) {
        this.id = id;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.redevence = redevence;
        this.valsync = valsync;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Float getRedevence() {
        return redevence;
    }

    public void setRedevence(Float redevence) {
        this.redevence = redevence;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }
}

