package com.lover.util.recursive;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author: 李惠福
 * @Create: 2019/7/10  13:59
 */
public class TestRecursive {

    public static void main(String[] args) {
        District nx = new District("ningxia", "宁夏", null);
        District yc = new District("yinchuan", "银川", "ningxia");
        District wy = new District("wangyuan", "望远", "yinchuan");
        District gy = new District("guyuan", "固原", "ningxia");
        District xj = new District("xiji", "西吉", "guyuan");
        District py = new District("pengyang", "彭阳", "guyuan");
        District px = new District("piancheng", "偏城", "xiji");

        List<District> districts = new ArrayList<>();
        List<String> districtList = new ArrayList<>();
        districtList.add("xiji");
        districts.add(xj);
        districts.add(nx);
        districts.add(gy);
        districts.add(px);
        districts.add(py);
        districts.add(yc);
        districts.add(wy);
        TestRecursive recursive = new TestRecursive();
        List<District> list = recursive.districtTree(districts, null, districtList);
        for (District district : list) {
            System.out.println("district = " + district);
        }

        List<District> toList = recursive.districtToList(list);
        for (District district : toList) {
//            district.setChild(null);
            System.out.println("district = " + district);
        }
    }
    private List<District> districtTree(List<District> districts, District district, List<String> districtList) {
        List<District> result = new ArrayList<>();
        List<District> collect = null;
        if (district != null) {
            collect = districts.stream().filter(x -> x.getParentCode() != null && !"".equals(x.getParentCode()) && x.getParentCode().equals(district.getCode())).collect(Collectors.toList());
        } else {
            collect = districts.stream().filter(x -> x.getParentCode() == null || "".equals(x.getParentCode())).collect(Collectors.toList());
        }
        if (!collect.isEmpty()) {
            for (District childDistrict : collect) {
                List<District> child = this.districtTree(districts, childDistrict, districtList);
                if (child != null && !child.isEmpty()) {
                    childDistrict.setChild(child);
                }
                Optional<String> first = districtList.stream().filter(x -> x.equals(childDistrict.getCode())).findFirst();
                if ((childDistrict.getChild() != null && !childDistrict.getChild().isEmpty() || first.isPresent())) {
                    if (first.isPresent()) {
                        childDistrict.setChooseAble(true);
                    }
                    result.add(childDistrict);
                }
            }
        }
        return result;
    }

    private List<District> districtToList(List<District> districts) {
        List<District> result = new ArrayList<>();
        for (District district : districts) {
            result.add(district);
            List<District> child = district.getChild();
            if (child != null && !child.isEmpty()) {
                List<District> list = this.districtToList(child);
                result.addAll(list);
            }
        }
        return result;
    }
}
