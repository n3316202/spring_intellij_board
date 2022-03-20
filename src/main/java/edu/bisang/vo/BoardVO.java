package edu.bisang.vo;

import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.util.Date;

@Log4j
@Data
public class BoardVO {

    private Long bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private Date updateDate;

    private int replyCnt;
}
