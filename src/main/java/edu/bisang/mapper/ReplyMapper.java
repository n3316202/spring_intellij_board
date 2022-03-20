package edu.bisang.mapper;

import edu.bisang.vo.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {
    public int insert(ReplyVO vo);
}
