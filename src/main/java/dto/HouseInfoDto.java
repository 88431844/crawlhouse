
package dto;

import entity.HouseInfo;

public class HouseInfoDto  extends HouseInfo {
  private Integer id;

  /**
   * 房源标题
   */
  private String title;
  /**
   * 月租（元/月）
   */
  private Integer monthlyRent;
  private String monthlyRentStr;
  private Integer maxRent;
  private Integer minRent;
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
  private String areaStr;
  private Integer maxArea;
  private Integer minArea;
  /**
   * 楼层
   */
  private String floor;
  private String maxFloor;
  private String minFloor;
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
  private String maxReleaseDate;
  private String minReleaseDate;
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

  @Override
  public Integer getId() {
    return id;
  }

  @Override
  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public Integer getMonthlyRent() {
    return monthlyRent;
  }

  @Override
  public void setMonthlyRent(Integer monthlyRent) {
    this.monthlyRent = monthlyRent;
  }

  public String getMonthlyRentStr() {
    return monthlyRentStr;
  }

  public void setMonthlyRentStr(String monthlyRentStr) {
    this.monthlyRentStr = monthlyRentStr;
  }

  public Integer getMaxRent() {
    return maxRent;
  }

  public void setMaxRent(Integer maxRent) {
    this.maxRent = maxRent;
  }

  public Integer getMinRent() {
    return minRent;
  }

  public void setMinRent(Integer minRent) {
    this.minRent = minRent;
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
  public Integer getArea() {
    return area;
  }

  @Override
  public void setArea(Integer area) {
    this.area = area;
  }

  public String getAreaStr() {
    return areaStr;
  }

  public void setAreaStr(String areaStr) {
    this.areaStr = areaStr;
  }

  public Integer getMaxArea() {
    return maxArea;
  }

  public void setMaxArea(Integer maxArea) {
    this.maxArea = maxArea;
  }

  public Integer getMinArea() {
    return minArea;
  }

  public void setMinArea(Integer minArea) {
    this.minArea = minArea;
  }

  @Override
  public String getFloor() {
    return floor;
  }

  @Override
  public void setFloor(String floor) {
    this.floor = floor;
  }

  public String getMaxFloor() {
    return maxFloor;
  }

  public void setMaxFloor(String maxFloor) {
    this.maxFloor = maxFloor;
  }

  public String getMinFloor() {
    return minFloor;
  }

  public void setMinFloor(String minFloor) {
    this.minFloor = minFloor;
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

  public String getMaxReleaseDate() {
    return maxReleaseDate;
  }

  public void setMaxReleaseDate(String maxReleaseDate) {
    this.maxReleaseDate = maxReleaseDate;
  }

  public String getMinReleaseDate() {
    return minReleaseDate;
  }

  public void setMinReleaseDate(String minReleaseDate) {
    this.minReleaseDate = minReleaseDate;
  }

  @Override
  public String getFristImg() {
    return fristImg;
  }

  @Override
  public void setFristImg(String fristImg) {
    this.fristImg = fristImg;
  }

  public String getFaceto() {
    return faceto;
  }

  public void setFaceto(String faceto) {
    this.faceto = faceto;
  }

  @Override
  public String getSource() {
    return source;
  }

  @Override
  public void setSource(String source) {
    this.source = source;
  }
}