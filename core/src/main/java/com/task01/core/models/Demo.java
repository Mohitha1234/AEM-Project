package com.task01.core.models;

import java.util.List;

public interface Demo {
    public String  getArticleTitle();
    public String  getArticleDescription();
    public int getArticleNumber();
    public String[] getBookNames();
    public List<ChildBookDetails> getCompleteBookdetails();
}

