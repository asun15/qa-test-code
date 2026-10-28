
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import java.time.Duration
import java.util.Properties

def props = new Properties()
props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
props.put(ConsumerConfig.GROUP_ID_CONFIG, "katalon-qa-group")
props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.name)
props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.name)
props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")

def consumer = new KafkaConsumer<String, String>(props)

try {
	consumer.subscribe(["qa-test-topic"])

	def records = consumer.poll(Duration.ofSeconds(10))

	if (records.isEmpty()) {
		println("FAIL: No Kafka message received")
	} else {
		records.each { record ->
			println("Message received: " + record.value())
		}
		println("Kafka consumer test PASSED")
	}
} finally {
	consumer.close()
}
