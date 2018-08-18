package com.adpanshi.cashloan.data.thirdparty.equifax.pojo.equifaxreport;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.io.Serializable;

public class AgeInfo implements Serializable {
    @XStreamImplicit(itemFieldName="sch:Age")
    private String[] ages;

    public String[] getAges() {
        return ages;
    }

    public void setAges(String[] ages) {
        this.ages = ages;
    }
}
