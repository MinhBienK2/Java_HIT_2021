package Bai3;

import java.sql.Array;
import java.util.ArrayList;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int []rateList = new int[3];

    @Override
    public void Display() {
        System.out.printf("%-20d%-20s%-20s%-20s%-20s%-20f\n",id,title,publishDate,author,content,averageRate);
    }

    public void calculate() {
        float sum =0;
        for(int i=0;i<3;i++)
            sum+=rateList[i];
        averageRate = sum/(float)3;
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }
}
