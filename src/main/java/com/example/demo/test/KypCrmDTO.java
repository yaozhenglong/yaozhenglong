package com.example.demo.test;

import java.math.BigDecimal;

public class KypCrmDTO {
    private long id;
    private String productId;
    private String tagDesc;
    private String tagName;
    private String extraFields;
    private String labelId;
    private Double last;
    private Double priority;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getLast() {
        return last;
    }

    public void setLast(Double last) {
        this.last = last;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTagDesc() {
        return tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getExtraFields() {
        return extraFields;
    }

    public void setExtraFields(String extraFields) {
        this.extraFields = extraFields;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public Double getPriority() {
        return priority;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "KypCrmDTO{" +
                "productId='" + productId + '\'' +
                ", tagDesc='" + tagDesc + '\'' +
                ", tagName='" + tagName + '\'' +
                ", extraFields='" + extraFields + '\'' +
                ", labelId='" + labelId + '\'' +
                ", last=" + last +
                ", priority=" + priority +
                '}';
    }
}
