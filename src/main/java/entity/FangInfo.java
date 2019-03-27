package entity;

import us.codecraft.webmagic.model.annotation.TargetUrl;

@TargetUrl("https://sy.zu.fang.com/chuzu/*.htm")
public class FangInfo extends HouseInfo{

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
}
