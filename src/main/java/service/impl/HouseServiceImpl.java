package service.impl;

import entity.HouseInfo;
import java.util.List;

import dao.HouseInfoMapper;
import dto.HouseInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import service.HouseService;

@Service
public class HouseServiceImpl implements HouseService {

  @Autowired
  private HouseInfoMapper houseInfoMapper;

  @Override
  public List<HouseInfo> list() {
    return houseInfoMapper.list();
  }

  @Override
  public List<HouseInfo> seach(HouseInfoDto houseInfoDto) {
    //拼装搜索条件
    HouseInfoDto search = new HouseInfoDto();
    search.setTitle("".equals(houseInfoDto.getTitle()) ? null : houseInfoDto.getTitle());
    search.setRentType("".equals(houseInfoDto.getRentType()) ? null : houseInfoDto.getRentType());
    search.setAddr("".equals(houseInfoDto.getAddr()) ? null : houseInfoDto.getAddr());
    search.setFaceTo("".equals(houseInfoDto.getFaceTo()) ? null : houseInfoDto.getFaceTo());

    if (!StringUtils.isEmpty(houseInfoDto.getMonthlyRentRange())){
      int minRent = Integer.parseInt(houseInfoDto.getMonthlyRentRange().split("-")[0]);
      int maxRent = Integer.parseInt(houseInfoDto.getMonthlyRentRange().split("-")[1]);
      search.setMinRent(minRent);
      search.setMaxRent(maxRent);
    }

    int roomSum = houseInfoDto.getRoomSum();
    int hallSum = houseInfoDto.getHallSum();
    String roomType;
    if (-1 == hallSum && -1 == roomSum){
      roomType = null;
    }
    else if (-1 == roomSum){
      roomType = hallSum + "厅";
    }
    else if (-1 == hallSum){
      roomType = roomSum + "室";
    }
    else {
      roomType = roomSum + "室"+ hallSum +"厅";
    }
    search.setRoomType(roomType);

    if (!StringUtils.isEmpty(houseInfoDto.getAreaRange())){
      int minArea = Integer.parseInt(houseInfoDto.getAreaRange().split("-")[0]);
      int maxArea = Integer.parseInt(houseInfoDto.getAreaRange().split("-")[1]);
      search.setMinArea(minArea);
      search.setMaxArea(maxArea);
    }

    return houseInfoMapper.seach(search);
  }
}
