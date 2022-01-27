package com.meriem.myapplicationexpert;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.meriem.myapplicationexpert.model.Intervention;

import java.sql.Time;
import java.util.Date;

@Entity
public class interventions {
    @PrimaryKey(autoGenerate = true)
    private int  id ;
    private String address;
    private String society;
    private String  titre ;
    private String datedebut ;
    private String datefin ;
    private Time heuredebutplan ;
    private Time heurefinplan ;
    private String commentaires ;
    private Date dateplanification ;
    private Time heuredebuteffect ;
    private Time heurefineffect ;
    private Boolean terminee ;
    private Date dateterminaison ;
    private Boolean validee ;
    private Date datevalidation ;
    private int valsync ;

    public static void add(Intervention intervention) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public Time getHeuredebutplan() {
        return heuredebutplan;
    }

    public void setHeuredebutplan(Time heuredebutplan) {
        this.heuredebutplan = heuredebutplan;
    }

    public Time getHeurefinplan() {
        return heurefinplan;
    }

    public void setHeurefinplan(Time heurefinplan) {
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

    public Time getHeuredebuteffect() {
        return heuredebuteffect;
    }

    public void setHeuredebuteffect(Time heuredebuteffect) {
        this.heuredebuteffect = heuredebuteffect;
    }

    public Time getHeurefineffect() {
        return heurefineffect;
    }

    public void setHeurefineffect(Time heurefineffect) {
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

    public interventions(int id, String address, String society, String titre, String datedebut, String datefin, Time heuredebutplan, Time heurefinplan, String commentaires, Date dateplanification, Time heuredebuteffect, Time heurefineffect, Boolean terminee, Date dateterminaison, Boolean validee, Date datevalidation, int valsync) {
        this.id = id;
        this.address = address;
        this.society = society;
        this.titre = titre;
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
    }
}
