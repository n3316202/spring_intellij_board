package edu.bisang.service;

import edu.bisang.mapper.BoardMapper;
import edu.bisang.mapper.ReplyMapper;
import edu.bisang.vo.BoardVO;
import edu.bisang.vo.ReplyVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j
@Service
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService{

    @Setter(onMethod_ = @Autowired)
    private ReplyMapper replyMapper;

    @Setter(onMethod_ = @Autowired)
    private BoardMapper boardMapper;

    //@Transactional
    @Override
    public int register(ReplyVO vo) {

        log.info("register......" + vo);

        boardMapper.updateReplyCnt(vo.getBno(), 1);

        return replyMapper.insert(vo);

    }


}
