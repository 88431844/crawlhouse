package service.impl;

import java.util.List;

import dao.HouseInfoMapper;
import dto.HouseInfoDto;
import entity.HouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import service.HouseService;

public class HouseServiceImpl implements HouseService {

  @Autowired
  private HouseInfoMapper houseInfoMapper;

  @Override
  public List<HouseInfoDto> seach(HouseInfoDto houseInfoDto) {
    return null;
  }
}
