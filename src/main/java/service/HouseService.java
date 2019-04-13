package service;

import dto.HouseInfoDto;

import entity.HouseInfo;
import java.util.List;

public interface HouseService {

  List<HouseInfo> list();

  List<HouseInfo> seach(HouseInfoDto houseInfoDto);
}
