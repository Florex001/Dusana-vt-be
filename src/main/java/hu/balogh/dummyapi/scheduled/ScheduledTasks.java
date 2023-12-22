package hu.balogh.dummyapi.scheduled;

import hu.balogh.dummyapi.service.Impl.NewsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
public class ScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(NewsServiceImpl.class);

    @Scheduled(fixedRate = 60000)
    public void myScheduledMethod() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MM. dd. ----> HH:mm");

        String formattedDateTime = now.format(formatter);

        logger.info("Ébresztő: " + formattedDateTime);
    }

}
