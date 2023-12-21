package hu.balogh.dummyapi.controller;

import hu.balogh.dummyapi.controller.dto.NewsDto;
import hu.balogh.dummyapi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@CrossOrigin(origins = {"https://kossuth-vt-xgjc.vercel.app", "https://kossuth-vt-8zfc.vercel.app"})
public class NewsController {

    private NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/getAllNews")
    public ResponseEntity<List<NewsDto>> getAllNews() {
        try {
            List<NewsDto> newsDto = newsService.getAllNews();
            return ResponseEntity.ok().body(newsDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping()
    public ResponseEntity<String> saveNews(@RequestBody NewsDto newsDto){
        try {
            newsService.createNews(newsDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Sikeres létrehozás.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Érvénytelen kérés.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sikertelen létrehozás.");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteNews(@PathVariable int id){
        try {
            newsService.deleteNews(id);
            return ResponseEntity.status(HttpStatus.OK).body("Sikeres törlés");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Érvénytelen kérés.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sikertelen törlés.");
        }
    }
}

