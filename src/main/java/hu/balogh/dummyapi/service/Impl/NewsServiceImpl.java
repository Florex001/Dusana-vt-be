package hu.balogh.dummyapi.service.Impl;

import hu.balogh.dummyapi.controller.dto.NewsDto;
import hu.balogh.dummyapi.mapper.NewsMapper;
import hu.balogh.dummyapi.repository.NewsRepository;
import hu.balogh.dummyapi.repository.entity.NewsEntity;
import hu.balogh.dummyapi.service.NewsService;
import jdk.jshell.execution.Util;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    public void createNews(NewsDto newsDto) {
        if (newsDto != null){
            if (StringUtils.isEmpty(newsDto.getTemacim())) {
                logger.warn("A téma címe nem lehet üres.");
                return;
            }
            if (StringUtils.isEmpty(newsDto.getTemadatum())) {
                logger.warn("A téma dátum nem lehet üres.");
                return;
            }
            NewsEntity newsEntity = NewsMapper.INSTANCE.toEntity(newsDto);
            newsRepository.save(newsEntity);
            logger.info("News mentésre került.");
        }else {
            logger.warn("A news üres volt így nem került mentésre.");
        }
    }

    @Override
    public void deleteNews(int id) {
        if (StringUtils.isEmpty(id)) {
            logger.warn("A hír azonosítója nem lehet üres.");
            return;
        }

        try {
            newsRepository.deleteById(id);
            logger.info("Sikeresen törölte a hírt: {}", id);
        } catch (EmptyResultDataAccessException e) {
            logger.warn("A hír nem található az azonosító alapján: {}", id);
        }
    }
}
