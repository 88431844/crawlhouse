package entity;

import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

//@TargetUrl("https://sy.zu.fang.com/chuzu/([0-9_][0-9_][0-9_][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9_][0-9]).htm")
@TargetUrl("https://sy.zu.fang.com/chuzu/([0-9][0-9_][0-9_][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9_][0-9]).htm")

public class FangInfo extends HouseInfo{
    /**
     * 房源标题
     */
    @ExtractBy("//h1[@class='title']/text()")
    private String title;
    /**
     * 月租（元/月）
     */
    @ExtractBy("//div[@class='trl-item sty1']/i/text()")
    private String monthlyRent;
    /**
     * 付款方式（押一付三等）
     */
    @ExtractBy("//div[@class='trl-item sty1']/text()")
    private String payType;
    /**
     * 租赁方式（整租等）
     */
    @ExtractBy("//div[@class='tr-line clearfix']/div[1]/div[@class='tt']/text()")
    private String rentType;
    /**
     * 房屋类型（两室一厅等）
     */
    @ExtractBy("//div[@class='trl-item1 w182']/div[@class='tt']/text()")
    private String roomType;
    /**
     * 面积
     */
    @ExtractBy("//div[@class='tr-line clearfix']/div[1]/div[@class='tt']/text()")
    private String area;
    /**
     * 楼层
     */
    @ExtractBy("//div[@class='trl-item1 w182']/div[@class='tt']/text()")
    private String floor;
    /**
     * 地址
     */
    @ExtractBy("//div[@class='tr-line clearfix']/div[2]/div[@class='tt']/text()")
    private String addr;
    /**
     * 装修情况（简单装修，豪华装修等）
     */
    @ExtractBy("//div[@class='tr-line clearfix']/div[3]/div[@class='tt']/text()")
    private String decoration;
    /**
     * 发布时间
     */
    @ExtractBy("//p[@class='gray9 fybh-zf']/span[2]/text()")
    private String releaseDate;
    /**
     * 房源首图
     */
    @ExtractBy("//div[@class='bigImg']/img[1]/@src")
    private String fristImg;
    /**
     * 朝向（东北等）
     */
    @ExtractBy("//div[@class='tr-line clearfix']/div[2]/div[@class='tt']/text()")
    private String faceTo;
    /**
     * 来源
     */
    private String source = "房天下";

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
    public String getSource() {
        return source;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getFaceTo() {
        return faceTo;
    }

    @Override
    public void setFaceTo(String faceTo) {
        this.faceTo = faceTo;
    }
}

