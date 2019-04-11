package dao;

import entity.HouseInfo;
import java.util.List;

public interface HouseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseInfo record);

    int insertSelective(HouseInfo record);

    HouseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseInfo record);

    int updateByPrimaryKey(HouseInfo record);

    int haveHouseInfo(HouseInfo houseInfo);

  List<HouseInfo> seach(HouseInfo houseInfo);
}