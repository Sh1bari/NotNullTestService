package org.example;

import ru.sovcombank.hackaton.proto.ExchangeInfoMessage;
import ru.sovcombank.hackaton.proto.MessageEnumsProto;
import ru.sovcombank.hackaton.proto.OwnCommand;
import ru.sovcombank.hackaton.proto.Request;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 8888);
        OutputStream out = socket.getOutputStream();
        ExchangeInfoMessage exchangeInfoMessage = ExchangeInfoMessage.newBuilder()
                .setRequest(Request.newBuilder()
                        .setCommand(MessageEnumsProto.CommandType.ctHandshake)
                        .setCommandForExec(OwnCommand.newBuilder()
                                .setAlias("hello")
                                .build())
                        .build())
                .build();
        System.out.println(exchangeInfoMessage.getRequest().getCommand().name());
        byte[] data = exchangeInfoMessage.toByteArray();
        out.write(data);
        out.flush();
        Thread.sleep(9999999);
    }
}