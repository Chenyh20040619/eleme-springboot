package com.chenyh.eleme.po;

public class Business {
    private Integer businessId;
    private String password;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private Double starPrice;
    private Double deliveryPrice;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public void setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }

    public Double getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(Double starPrice) {
        this.starPrice = starPrice;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Business(){}

    public Business(Integer businessId, String password, String businessName, String businessAddress, String businessExplain, Double starPrice, Double deliveryPrice) {
        this.businessId = businessId;
        this.password = password;
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessExplain = businessExplain;
        this.starPrice = starPrice;
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public String toString() {
        return "\n???????????????"+this.businessId+
                "\n???????????????"+this.businessName+
                "\n???????????????"+this.businessAddress+
                "\n???????????????"+this.businessExplain+
                "\n??????????????"+this.starPrice+
                "\n??????????????"+this.deliveryPrice+"\n";
    }

}
