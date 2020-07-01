package com.example.rabbitmq.consumer.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

@Component
public class Consumer {
    private static final String newLine = System.getProperty("line.separator");
    @RabbitListener(queues = "${queue.name}")

    public void recievedMessage(String msg) throws IOException {

        System.out.println("Message = " + msg);
        File file = new File("D:\\microservice\\rabbitMq\\file1.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(newLine+msg);

        br.close();
        fr.close();

    }


}
