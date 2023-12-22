package hu.balogh.dummyapi.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 60000)
    public void myScheduledMethod() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MM. dd. ----> HH:mm");

        String formattedDateTime = now.format(formatter);

        System.out.println("Ébresztő: " + formattedDateTime);
    }

}
