package com.lover.util.recursive;

import java.util.List;

/**
 * @Author: 李惠福
 * @Create: 2019/7/10  13:57
 */
public class District {
    private String code;
    private String name;
    private String parentCode;
    private List<District> child;
    private boolean chooseAble = false;

    @Override
    public String toString() {
        return "District{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", child=" + child +
                ", chooseAble=" + chooseAble +
                '}';
    }

    public boolean isChooseAble() {
        return chooseAble;
    }

    public void setChooseAble(boolean chooseAble) {
        this.chooseAble = chooseAble;
    }

    public List<District> getChild() {
        return child;
    }

    public void setChild(List<District> child) {
        this.child = child;
    }

    public District(String code, String name, String parentCode) {
        this.code = code;
        this.name = name;
        this.parentCode = parentCode;
    }

    public District() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
