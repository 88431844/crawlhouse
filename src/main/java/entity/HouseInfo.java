package entity;

public class HouseInfo {
    private Integer id;

    /**
     * 房源标题
     */
    private String title;
    /**
     * 月租（元/月）
     */
    private Integer monthlyRent;
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
    private Integer area;
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
    private String faceTo;
    /**
     * 来源：
     * 安居客
     * 房天下
     */
    private String source;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Integer monthlyRent) {
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
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

    public String getFaceTo() {
        return faceTo;
    }

    public void setFaceTo(String faceTo) {
        this.faceTo = faceTo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}