package com.hayleydodkins.portfolioapplication;

public class Project {
    public String title;
    public String description;

    int image;

    //For every resource android makes a numeric id to use in java code

    public Project(String title, String desc, int image)
    {
        this.title = title;
        this.description = desc;
        this.image = image;
    }
}
