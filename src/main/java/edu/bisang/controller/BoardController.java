package edu.bisang.controller;

import edu.bisang.page.Criteria;
import edu.bisang.page.PageDTO;
import edu.bisang.service.BoardService;
import edu.bisang.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@Log4j
@RequestMapping("/board/*")
public class BoardController {

    @Inject
    private BoardService service;

    @GetMapping("/register")
    public void register() {
    }

    @PostMapping("/register")
    public String register(BoardVO board, RedirectAttributes rttr) {

        log.info("register: " + board);
        service.register(board);
        rttr.addFlashAttribute("result", board.getBno());

        return "redirect:/board/list";
    }

    @GetMapping({"/get", "/modify"})
    public void get(@RequestParam("bno") Long bno, Model model) {

        log.info("/get or modify ");
        model.addAttribute("board", service.get(bno));
    }

    @PostMapping("/modify")
    public String modify(BoardVO board, RedirectAttributes rttr) {
        log.info("modify:" + board);

        if (service.modify(board)) {
            rttr.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }


    /*
        @GetMapping("/list")
        public void list(Model model) {

            log.info("list");
            model.addAttribute("list", service.getList());
        }
    */

    @GetMapping("/list")
    public void list(Criteria cri, Model model) {

        log.info("list: " + cri);
        model.addAttribute("list", service.getList(cri));
        // model.addAttribute("pageMaker", new PageDTO(cri, 123));

        int total = service.getTotal(cri);

        log.info("total: " + total);

        model.addAttribute("pageMaker", new PageDTO(cri, total));

    }

    @PostMapping("/remove")
    public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {

        log.info("remove..." + bno);

        if (service.remove(bno)) {
            rttr.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }


}

