package hu.balogh.patakparlat_BE.controller;

import hu.balogh.patakparlat_BE.controller.dto.NewsDto;
import hu.balogh.patakparlat_BE.controller.dto.NewsPostDTO;
import hu.balogh.patakparlat_BE.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/getAllNews")
    public ResponseEntity<List<NewsDto>> getAllNews() {
        List<NewsDto> newsDto = newsService.getAllNews();
        return ResponseEntity.status(HttpStatus.OK).body(newsDto);
    }

    @PostMapping()
    public ResponseEntity saveNews(@RequestBody NewsPostDTO newsPostDTO){
        newsService.createNews(newsPostDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteNews(@PathVariable int id){
        newsService.deleteNews(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}

