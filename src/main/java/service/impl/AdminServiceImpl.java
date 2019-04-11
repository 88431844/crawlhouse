package service.impl;

import org.springframework.stereotype.Service;
import service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public void testMysql() {
        System.out.println("---- TestServiceImpl testMysql");
    }
}
