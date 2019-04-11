package service.impl;

import dao.HouseInfoMapper;
import entity.HouseInfo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import service.HouseService;

public class HouseServiceImpl implements HouseService {

  @Autowired
  private HouseInfoMapper houseInfoMapper;

  @Override
  public List<HouseInfo> seach(HouseInfo houseInfo) {
    return houseInfoMapper.seach(houseInfo);
  }
}
