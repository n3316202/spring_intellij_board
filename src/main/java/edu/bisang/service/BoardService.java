package edu.bisang.service;

import edu.bisang.page.Criteria;
import edu.bisang.vo.BoardVO;

import java.util.List;

public interface BoardService {
    public void register(BoardVO board);
    public List<BoardVO> getList();
    public boolean remove(Long bno);
    public BoardVO get(Long bno);
    public boolean modify(BoardVO board);
    public List<BoardVO> getList(Criteria cri);
    public int getTotal(Criteria cri);

}
