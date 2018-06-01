package org.androidtown.newjjjproject;

public class BoardItem {

    int ratingBar;
    String txt_modelName;
    String txt_review;

    public BoardItem(int ratingBar, String txt_modelName, String txt_review)
    {
        this.ratingBar = ratingBar;
        this.txt_modelName= txt_modelName;
        this.txt_review= txt_review;
    }


    public int getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(int ratingBar) {
        this.ratingBar = ratingBar;
    }

    public String getTxt_modelName() {
        return String.valueOf(txt_modelName);
    }

    public void setTxt_modelName(String txt_modelName) {
        this.txt_modelName = txt_modelName;
    }

    public String getTxt_review() {
        return String.valueOf(txt_review);
    }

    public void setTxt_review(String txt_review) {
        this.txt_review = txt_review;
    }
}
