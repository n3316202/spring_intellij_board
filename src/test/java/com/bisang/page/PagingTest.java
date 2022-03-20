package com.bisang.page;

import edu.bisang.vo.BoardVO;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.fail;

/*
        8.1.1페이징 처리 원칙

        -페이징 처리는 반드시 GET방식만을 이용해서 처리합니다.(페이지는 다른 사람에게 URL로 전달하는 경우가 많기 때문에,)
        -페이징 처리가 되면 조회하면에서 반드시 목록가기가 필요합니다.
        -페이징 처리에는 반드시 필요한 페이지 번호 만을 제공합니다.

        8.2페이징 처리 개발에 필요한 지식

        -페이징 처리를 위한 SQL
        -데이터 갯수 파악을 위한 SQL
        -자바 스크립트 혹은<a> 태그를 통한 이벤트 처리

        개발 순서

        -단순히 페이지 데이터를 화면에 출력하는 작업
        -화면 하단에 페이지 번호가 출력되고,이를 클릭할 경우 제대로 이동하는 작업
        -조회 페이지에서 목록가기를 선택하면 보던 페이지 정보를 유지한채로 이동하는 작업
        8.2.1MySQL의 limit를 이용한 페이지 출력 SQL
        8.2.1.1충분한 양의 데이터 넣기

        넣기
        insert into tbl_board(title,content,writer)(select title,content,writer from tbl_board);
*/

@Log4j
//xml설정방식 사용 시
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//java설정방식 사용 시
//@ContextConfiguration(classes = {RootConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PagingTest {


    @Test
    public void testListPage() throws Exception {


    }

}


