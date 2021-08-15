package hatanaka.example.kafka.consumer;

import hatanaka.example.kafka.dto.AlertDto;
import hatanaka.example.kafka.producer.KafkaProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(UserSink2.class)
//@EnableBinding(KafkaProcessor.class)
public class AvroConsumer2 {

  private static final Logger LOGGER = LoggerFactory.getLogger(AvroConsumer.class);

//  @StreamListener(UserSink2.INPUT)
  @StreamListener(UserSink2.ALERT_INPUT)
  public void process(AlertDto alertDto) {
    LOGGER.info("Let's process employee details: {}", alertDto);
  }

}
