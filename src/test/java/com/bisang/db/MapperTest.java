package com.bisang.db;

import edu.bisang.mapper.TestTimeMapper;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;

import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {RootConfig.class})
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MapperTest {

    @Autowired
    private TestTimeMapper testMapper;

    @Test
    public void getTime() {
        log.info("'현재 시각 : " + testMapper.getTime()+"'");
    }
}

