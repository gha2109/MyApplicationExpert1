package com.meriem.myapplicationexpert.model;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public class Intervention {
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

    public Intervention(String address, String society, String titre, String datedebut, String datefin) {
        this.address = address;
        this.society = society;
        this.titre = titre;
        this.datedebut = (datedebut);
        this.datefin = datefin;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getSociety() {
        return society;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public Time getHeuredebutplan() {
        return heuredebutplan;
    }

    public Time getHeurefinplan() {
        return heurefinplan;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public Date getDateplanification() {
        return dateplanification;
    }

    public Time getHeuredebuteffect() {
        return heuredebuteffect;
    }

    public Time getHeurefineffect() {
        return heurefineffect;
    }

    public Boolean getTerminee() {
        return terminee;
    }

    public Date getDateterminaison() {
        return dateterminaison;
    }

    public Boolean getValidee() {
        return validee;
    }

    public Date getDatevalidation() {
        return datevalidation;
    }

    public int getValsync() {
        return valsync;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public void setHeuredebutplan(Time heuredebutplan) {
        this.heuredebutplan = heuredebutplan;
    }

    public void setHeurefinplan(Time heurefinplan) {
        this.heurefinplan = heurefinplan;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public void setDateplanification(Date dateplanification) {
        this.dateplanification = dateplanification;
    }

    public void setHeuredebuteffect(Time heuredebuteffect) {
        this.heuredebuteffect = heuredebuteffect;
    }

    public void setHeurefineffect(Time heurefineffect) {
        this.heurefineffect = heurefineffect;
    }

    public void setTerminee(Boolean terminee) {
        this.terminee = terminee;
    }

    public void setDateterminaison(Date dateterminaison) {
        this.dateterminaison = dateterminaison;
    }

    public void setValidee(Boolean validee) {
        this.validee = validee;
    }

    public void setDatevalidation(Date datevalidation) {
        this.datevalidation = datevalidation;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }


}
