package hu.balogh.patakparlat_BE.service;

import hu.balogh.patakparlat_BE.controller.dto.NewsDto;
import hu.balogh.patakparlat_BE.controller.dto.NewsPostDTO;

import java.util.List;

public interface NewsService {
    public List<NewsDto> getAllNews();
    public void createNews(NewsPostDTO newsPostDTO);
    public void deleteNews(int id);

}
