package edu.bisang.mapper;

import edu.bisang.page.Criteria;
import edu.bisang.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    public void insert(BoardVO board);
    public List<BoardVO> getList();
    public int delete(Long bno);
    public BoardVO read(Long bno);
    public int update(BoardVO board);
    public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);

    List<BoardVO> getListWithPaging(Criteria cri);
    public int getTotalCount(Criteria cri);
}
