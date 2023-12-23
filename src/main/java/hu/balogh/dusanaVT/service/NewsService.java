package hu.balogh.dusanaVT.service;

import hu.balogh.dusanaVT.controller.dto.NewsDto;
import hu.balogh.dusanaVT.controller.dto.NewsPostDTO;

import java.util.List;

public interface NewsService {
    public List<NewsDto> getAllNews();
    public void createNews(NewsPostDTO newsPostDTO);
    public void deleteNews(int id);

}
