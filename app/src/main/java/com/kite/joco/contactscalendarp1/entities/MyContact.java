package com.kite.joco.contactscalendarp1.entities;

import com.kite.joco.contactscalendarp1.DbUtils.ContactsDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Joco on 2015.05.17..
 */
@Table(databaseName = ContactsDatabase.DB_NAME)
public class MyContact extends BaseModel{
    @Column
    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    String elsonev;

    @Column
    String masodiknev;

    @Column
    String kozepsonev;

    // Dr. vagy Prof. vagy id. vagy ifj. ilyesmiknek ez kell. (Prefix)
    @Column
    String elotag;

    @Column
    String telefonszam;

    public MyContact() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMasodiknev() {
        return masodiknev;
    }

    public void setMasodiknev(String masodiknev) {
        this.masodiknev = masodiknev;
    }

    public String getKozepsonev() {
        return kozepsonev;
    }

    public void setKozepsonev(String kozepsonev) {
        this.kozepsonev = kozepsonev;
    }

    public String getElotag() {
        return elotag;
    }

    public void setElotag(String elotag) {
        this.elotag = elotag;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getElsonev() {
        return elsonev;
    }

    public void setElsonev(String elsonev) {
        this.elsonev = elsonev;
    }
}

