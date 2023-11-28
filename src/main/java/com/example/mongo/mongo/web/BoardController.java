package com.example.mongo.mongo.web;

import com.example.mongo.mongo.domain.Board;
import com.example.mongo.mongo.domain.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardRepository boardRepository;

    @PutMapping("/board/{id}")
    public void update(@RequestBody BoardSaveDto dto, @PathVariable String id) {
        Board board = dto.toEntity();
        board.set_id(id);
        boardRepository.save(board);
    }

    @DeleteMapping("/board/{id}")
    public int deleteById(@PathVariable String id) {
        boardRepository.deleteById(id);

        return 1;
    }

    @GetMapping("/board")
    public List<Board> findAll() {

        return boardRepository.findAll();
    }

    @GetMapping("/board/{id}")
    public Board findById(@PathVariable String id) {

        return boardRepository.findById(id).get();
    }

    @PostMapping("/board")
    public Board save(@RequestBody BoardSaveDto dto) {
        Board boardEntity = boardRepository.save(dto.toEntity());

        return boardEntity;
    }

}
