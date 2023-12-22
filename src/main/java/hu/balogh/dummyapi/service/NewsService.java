package hu.balogh.dummyapi.service;

import hu.balogh.dummyapi.controller.dto.NewsDto;
import hu.balogh.dummyapi.controller.dto.NewsPostDTO;

import java.util.List;

public interface NewsService {
    public List<NewsDto> getAllNews();
    public void createNews(NewsPostDTO newsPostDTO);
    public void deleteNews(int id);

}
