package service;

import dto.HouseInfoDto;

import java.util.List;

public interface HouseService {
  List<HouseInfoDto> seach(HouseInfoDto houseInfoDto);
}
