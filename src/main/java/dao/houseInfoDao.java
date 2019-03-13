package dao;

import entity.houseInfo;
import org.apache.ibatis.annotations.Insert;

public interface houseInfoDao {
//INSERT INTO `crawlhouse`.`rentHouse` (`id`, `title`, `monthlyRent`, `payType`, `rentType`, `roomType`,
// `area`, `floor`, `addr`, `decoration`, `releaseDate`, `fristImg`)
// VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
    @Insert("insert into houseInfo (`houseType`,`direction`,`area`,`monthlyRent`,`sellType`,`releaseDate`,`floor`,`addr`) " +
            "values (#{houseType},#{direction},#{area},#{monthlyRent},#{sellType},#{releaseDate},#{floor},#{addr})")
    public int add(houseInfo houseInfo);
}
