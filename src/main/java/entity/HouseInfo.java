package entity;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.AfterExtractor;

public class HouseInfo implements AfterExtractor {

    /**
     * 房源标题
     */
    private String title;
    /**
     * 月租（元/月）
     */
    private String monthlyRent;
    /**
     * 付款方式（押一付三等）
     */
    private String payType;
    /**
     * 租赁方式（整租等）
     */
    private String rentType;
    /**
     * 房屋类型（两室一厅等）
     */
    private String roomType;
    /**
     * 面积
     */
    private String area;
    /**
     * 楼层
     */
    private String floor;
    /**
     * 地址
     */
    private String addr;
    /**
     * 装修情况（简单装修，豪华装修等）
     */
    private String decoration;
    /**
     * 发布时间
     */
    private String releaseDate;
    /**
     * 房源首图
     */
    private String fristImg;
    /**
     * 朝向（东北等）
     */
    private String faceto;
    /**
     * 来源：
     * 安居客
     * 房天下
     */
    private String source;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFristImg() {
        return fristImg;
    }

    public void setFristImg(String fristImg) {
        this.fristImg = fristImg;
    }

    public String getFaceto() {
        return faceto;
    }

    public void setFaceto(String faceto) {
        this.faceto = faceto;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
