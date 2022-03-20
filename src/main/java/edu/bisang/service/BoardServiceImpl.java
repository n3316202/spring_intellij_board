package edu.bisang.service;

import edu.bisang.mapper.BoardMapper;
import edu.bisang.page.Criteria;
import edu.bisang.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardMapper mapper;

    @Override
    public boolean modify(BoardVO board) {

        log.info("modify......" + board);

        return mapper.update(board) == 1;
    }

    @Override
    public List<BoardVO> getList(Criteria cri) {
        log.info("get List with criteria: " + cri);

        return mapper.getListWithPaging(cri);
    }

    @Override
    public int getTotal(Criteria cri) {

        log.info("get total count");
        return mapper.getTotalCount(cri);
    }

    @Override
    public void register(BoardVO board) {
        log.info("register......" + board);
        mapper.insert(board);
    }

    @Override
    public List<BoardVO> getList() {
        log.info("getList..........");
        return mapper.getList();
    }

    @Override
    public boolean remove(Long bno) {
        log.info("remove...." + bno);

        return mapper.delete(bno) == 1;
    }

    @Override
    public BoardVO get(Long bno) {
        return mapper.read(bno);
    }
}
