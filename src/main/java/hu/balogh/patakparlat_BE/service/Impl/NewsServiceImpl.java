package hu.balogh.patakparlat_BE.service.Impl;

import hu.balogh.patakparlat_BE.controller.dto.NewsDto;
import hu.balogh.patakparlat_BE.controller.dto.NewsPostDTO;
import hu.balogh.patakparlat_BE.mapper.NewsMapper;
import hu.balogh.patakparlat_BE.repository.NewsRepository;
import hu.balogh.patakparlat_BE.repository.entity.NewsEntity;
import hu.balogh.patakparlat_BE.service.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class NewsServiceImpl implements NewsService {

    private static final Logger logger = LoggerFactory.getLogger(NewsServiceImpl.class);
    private NewsRepository newsRepository;

    @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<NewsDto> getAllNews() {
        List<NewsEntity> newsEntity = newsRepository.findAll();
        logger.info("Sikeres news lekérdezés.");
        return NewsMapper.INSTANCE.toDtoList(newsEntity);
    }

    @Override
    public void createNews(NewsPostDTO newsPostDTO) {
            NewsEntity newsEntity = NewsMapper.INSTANCE.toEntityPost(newsPostDTO);
            newsRepository.save(newsEntity);
            logger.info("News mentésre került.");
    }

    @Override
    public void deleteNews(int id) {
            newsRepository.deleteById(id);
            logger.info("Sikeresen törölte a hírt: {}", id);
    }
}
