package service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Override
    public void testMysql() {
        System.out.println("---- TestServiceImpl testMysql");
    }
}
