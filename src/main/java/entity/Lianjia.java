
package entity;

import dto.HouseInfoDto;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

@TargetUrl("https://sy.lianjia.com/zufang/SY*.html")
  public class Lianjia extends HouseInfoDto {
  /**
   * 房源标题
   */
  @ExtractBy("//p[@class='content__title']/text()")
  private String title;
  /**
   * 月租（元/月）
   */
  @ExtractBy("//p[@class='content__aside--title']/span/text()")
  private String monthlyRentStr;

  /**
   * 付款方式（押一付三等）
   */
  @ExtractBy("//p[@class='content__aside--title']/text()")
  private String payType;
  /**
   * 租赁方式（整租等）
   */
  @ExtractBy("//[@class='content__article__table']/span[1]/text()")
  private String rentType;
  /**
   * 房屋类型（两室一厅等）
   */
  @ExtractBy("//[@class='content__article__table']/span[2]/text()")
  private String roomType;
  /**
   * 面积
   */
  @ExtractBy("//[@class='content__article__table']/span[3]/text()")
  private String areaStr;
  /**
   * 楼层
   */
  @ExtractBy("//div[@class='content__article__info']/ul/li[8]/text()")
  private String floor;
  /**
   * 装修情况（简单装修，豪华装修等）
   */
  @ExtractBy("//[@class='content__item__tag--decoration']/text()")
  private String decoration;
  /**
   * 发布时间
   */
  @ExtractBy("//div[@class='content__subtitle']/text()")
  private String releaseDate;
  /**
   * 房源首图
   */
  @ExtractBy("//ul[@class='content__article__slide__wrapper']/div[@class='content__article__slide__item']/img/@src")
  private String fristImg;
  /**
   * 朝向（东北等）
   */
  @ExtractBy("//[@class='content__article__table']/span[4]/text()")
  private String faceTo;
  /**
   * 来源
   */
  private String source = "链家";

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String getMonthlyRentStr() {
    return monthlyRentStr;
  }

  @Override
  public void setMonthlyRentStr(String monthlyRentStr) {
    this.monthlyRentStr = monthlyRentStr;
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
  public String getAreaStr() {
    return areaStr;
  }

  @Override
  public void setAreaStr(String areaStr) {
    this.areaStr = areaStr;
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
  public String getFaceTo() {
    return faceTo;
  }

  @Override
  public void setFaceTo(String faceTo) {
    this.faceTo = faceTo;
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