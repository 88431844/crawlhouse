package entity;

import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

@TargetUrl("https://sy.zu.anjuke.com/fangyuan/(0|[1-9][0-9]*)")
public class AnjukeInfo extends HouseInfo{

    /**
     * 房源标题
     */
    @ExtractBy("//h3/text()")
    private String title;
    /**
     * 月租（元/月）
     */
    @ExtractBy("//span[@class='light info-tag']/em/text()")
    private String monthlyRent;
    /**
     * 付款方式（押一付三等）
     */

    private String payType;
    /**
     * 租赁方式（整租等）
     */
    @ExtractBy("//li[@class='title-label-item rent']/text()")
    private String rentType;
    /**
     * 房屋类型（两室一厅等）
     */
    @ExtractBy("//ul[@class='house-info-zufang cf']/li[2]/span[2]/text()")
    private String roomType;
    /**
     * 面积
     */
    @ExtractBy("//ul[@class='house-info-zufang cf']/li[3]/span[2]/text()")
    private String area;
    /**
     * 楼层
     */
    @ExtractBy("//ul[@class='house-info-zufang cf']/li[5]/span[2]/text()")
    private String floor;
    /**
     * 地址
     */
    @ExtractBy("//ul[@class='house-info-zufang cf']/li[8]/span[2]/text()")
    private String addr;
    /**
     * 装修情况（简单装修，豪华装修等）
     */
    @ExtractBy("//ul[@class='house-info-zufang cf']/li[6]/span[2]/text()")
    private String decoration;
    /**
     * 发布时间
     */
    @ExtractBy("//div[@class='right-info']/text()")
    private String releaseDate;
    /**
     * 房源首图
     */
    @ExtractBy("//div[@id='room_pic_wrap']/div[1]/img/@src")
    private String fristImg;
    /**
     * 朝向（东北等）
     */
    @ExtractBy("//ul[@class='house-info-zufang cf']/li[4]/span[2]/text()")
    private String faceto;
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getMonthlyRent() {
        return monthlyRent;
    }

    @Override
    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    @Override
    public String getPayType() {
        return payType;
    }

    @Override
    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Override
    public String getRentType() {
        return rentType;
    }

    @Override
    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String getRoomType() {
        return roomType;
    }

    @Override
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String getArea() {
        return area;
    }

    @Override
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String getFloor() {
        return floor;
    }

    @Override
    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String getAddr() {
        return addr;
    }

    @Override
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String getDecoration() {
        return decoration;
    }

    @Override
    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    @Override
    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String getFristImg() {
        return fristImg;
    }

    @Override
    public void setFristImg(String fristImg) {
        this.fristImg = fristImg;
    }

    @Override
    public String getFaceto() {
        return faceto;
    }

    @Override
    public void setFaceto(String faceto) {
        this.faceto = faceto;
    }
}
