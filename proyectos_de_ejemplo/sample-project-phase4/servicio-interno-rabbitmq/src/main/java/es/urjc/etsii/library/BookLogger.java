package es.urjc.etsii.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class BookLogger {

    Logger logger = LoggerFactory.getLogger(BookLogger.class);

    public BookLogger() {
    }
    
    @RabbitListener(queues = "notifications")
    public void logBook(BookDto book) {

        logger.info("New book added to the library: " + book.getTitle());
        if(book.getDescription().length() > 10) {
            logger.error("Book description too long: " + book.getDescription().substring(20));
        } else {
            logger.info("Description length is ok: " + book.getDescription());
        }
    }

}
