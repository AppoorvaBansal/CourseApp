
package com.rajendra.courseapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("totalCourses")
    @Expose
    private String totalCourses;
    @SerializedName("image")
    @Expose
    private int image;

    public Category(String categoryId,String categoryName,String totalCourses,int image){
        this.categoryId=categoryId;
        this.categoryName=categoryName;
        this.totalCourses=totalCourses;
        this.image=image;



    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTotalCourses() {
        return totalCourses;
    }

    public void setTotalCourses(String totalCourses) {
        this.totalCourses = totalCourses;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
