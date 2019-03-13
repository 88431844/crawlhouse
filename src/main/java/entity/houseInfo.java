package entity;

import org.apache.commons.codec.digest.DigestUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.AfterExtractor;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.ExtractByUrl;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

@TargetUrl("https://sy.58.com/zufang/*.shtml")
@HelpUrl("https://sy.58.com/zufang/")
public class houseInfo implements AfterExtractor {

    private String houseType;

    @ExtractBy("//h1/text()")
    private String direction = "";

    private String area;

    private String monthlyRent;
    private String sellType;
    private String releaseDate;
    private String floor;
    private String addr;

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getSellType() {
        return sellType;
    }

    public void setSellType(String sellType) {
        this.sellType = sellType;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "houseInfo{" +
                "houseType='" + houseType + '\'' +
                ", direction='" + direction + '\'' +
                ", area='" + area + '\'' +
                ", monthlyRent='" + monthlyRent + '\'' +
                ", sellType='" + sellType + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", floor='" + floor + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    //    @ExtractBy("//h1/text()")
//    private String title="";
//    @ExtractBy("//p[@class='job-item-title']/text()")
//    private String salary="";
//    @ExtractBy("//div[@class='title-info']/h3/a/text()")
//    private String company="";
//    @ExtractBy("//div[@class='content content-word']/allText()")
//    private String description="";
//    private String source="sy.58.com";
//    @ExtractByUrl
//    private String url="";
//    private String urlMd5="";

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        if (description!=null){
//            this.description = description;
//        }
//    }
//
//    public String getSource() {
//        return source;
//    }
//
//    public void setSource(String source) {
//        this.source = source;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//        this.urlMd5 = DigestUtils.md5Hex(url);
//    }
//
//    public String getSalary() {
//        return salary;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "JobInfo{" +
//                "title='" + title + '\'' +
//                ", salary='" + salary + '\'' +
//                ", company='" + company + '\'' +
//                ", description='" + description + '\'' +
//                ", source='" + source + '\'' +
//                ", url='" + url + '\'' +
//                '}';
//    }

    @Override
    public void afterProcess(Page page) {
    }
}
