package com.meriem.myapplicationexpert.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity(foreignKeys = {@ForeignKey(entity = sites.class,
        parentColumns = "id",
        childColumns = "idSite",
        onDelete = ForeignKey.CASCADE)
})
public class interventions { @PrimaryKey(autoGenerate = true)
private int  id ;



    private String title ;
    @TypeConverters({Converter.class})
    private Date datedebut ;
    @TypeConverters({Converter.class})
    private Date datefin ;
    @TypeConverters({Converter.class})
    private Date heuredebutplan ;
    @TypeConverters({Converter.class})
    private Date heurefinplan ;
    private String commentaires ;
    @TypeConverters({Converter.class})
    private Date dateplanification ;
    @TypeConverters({Converter.class})
    private Date heuredebuteffect ;
    @TypeConverters({Converter.class})
    private Date heurefineffect ;
    private Boolean terminee ;
    @TypeConverters({Converter.class})
    private Date dateterminaison ;
    private Boolean validee ;
    @TypeConverters({Converter.class})
    private Date datevalidation ;
    private int valsync ;
    private int idSite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getHeuredebutplan() {
        return heuredebutplan;
    }

    public void setHeuredebutplan(Date heuredebutplan) {
        this.heuredebutplan = heuredebutplan;
    }

    public Date getHeurefinplan() {
        return heurefinplan;
    }

    public void setHeurefinplan(Date heurefinplan) {
        this.heurefinplan = heurefinplan;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Date getDateplanification() {
        return dateplanification;
    }

    public void setDateplanification(Date dateplanification) {
        this.dateplanification = dateplanification;
    }

    public Date getHeuredebuteffect() {
        return heuredebuteffect;
    }

    public void setHeuredebuteffect(Date heuredebuteffect) {
        this.heuredebuteffect = heuredebuteffect;
    }

    public Date getHeurefineffect() {
        return heurefineffect;
    }

    public void setHeurefineffect(Date heurefineffect) {
        this.heurefineffect = heurefineffect;
    }

    public Boolean getTerminee() {
        return terminee;
    }

    public void setTerminee(Boolean terminee) {
        this.terminee = terminee;
    }

    public Date getDateterminaison() {
        return dateterminaison;
    }

    public void setDateterminaison(Date dateterminaison) {
        this.dateterminaison = dateterminaison;
    }

    public Boolean getValidee() {
        return validee;
    }

    public void setValidee(Boolean validee) {
        this.validee = validee;
    }

    public Date getDatevalidation() {
        return datevalidation;
    }

    public void setDatevalidation(Date datevalidation) {
        this.datevalidation = datevalidation;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public interventions( String title, Date datedebut, Date datefin, Date heuredebutplan, Date heurefinplan, String commentaires, Date dateplanification, Date heuredebuteffect, Date heurefineffect, Boolean terminee, Date dateterminaison, Boolean validee, Date datevalidation, int valsync, int idSite) {
        this.id = id;
        this.title = title;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.heuredebutplan = heuredebutplan;
        this.heurefinplan = heurefinplan;
        this.commentaires = commentaires;
        this.dateplanification = dateplanification;
        this.heuredebuteffect = heuredebuteffect;
        this.heurefineffect = heurefineffect;
        this.terminee = terminee;
        this.dateterminaison = dateterminaison;
        this.validee = validee;
        this.datevalidation = datevalidation;
        this.valsync = valsync;
        this.idSite = idSite;
    }
}
