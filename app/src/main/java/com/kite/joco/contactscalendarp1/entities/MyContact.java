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

    public MyContact() {
    }
}

