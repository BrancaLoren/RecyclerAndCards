package com.example.ocean.gogo.modelo;

import java.util.Date;

/**
 * Created by aluno on 14/07/2016.
 */
public class Evento {

    private long id;
    private String title;
    private String subtitle;


    public Evento(long id, String title, String subtitle) {
        setId(id);
        setTitle(title);
        setSubtitle(subtitle);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
