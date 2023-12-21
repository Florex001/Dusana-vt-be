package hu.balogh.dummyapi.service;

import hu.balogh.dummyapi.controller.dto.NewsDto;

import java.util.List;

public interface NewsService {
    public List<NewsDto> getAllNews();
    public void createNews(NewsDto newsDto);
    public void deleteNews(String id);

}
