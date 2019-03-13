package dao;

import entity.houseInfo;
import org.apache.ibatis.annotations.Insert;

public interface houseInfoDao {

    @Insert("insert into houseInfo (`houseType`,`direction`,`area`,`monthlyRent`,`sellType`,`releaseDate`,`floor`,`addr`) " +
            "values (#{houseType},#{direction},#{area},#{monthlyRent},#{sellType},#{releaseDate},#{floor},#{addr})")
    public int add(houseInfo houseInfo);
}
