
package dto;

public class HouseInfoDto {
  private Integer id;

  /**
   * 房源标题
   */
  private String title;
  /**
   * 月租（元/月）
   */
  private String monthlyRent;
  private String maxRent;
  private String minRent;
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
  private String maxArea;
  private String minArea;
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
}