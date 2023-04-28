package org.example;

import ru.sovcombank.hackaton.proto.*;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class StatusMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 8888);
        OutputStream out = socket.getOutputStream();
        ExchangeInfoMessage exchangeInfoMessage = ExchangeInfoMessage.newBuilder()
                .setHeader(Header.newBuilder()
                        .setMessageNum("1")
                        .setTimestamp(System.currentTimeMillis())
                        .setSender("NotNullTestService123")
                        .setReceiver("NotNullServer")
                        .build())

                .setRequest(Request.newBuilder()
                        .setCommand(MessageEnumsProto.CommandType.ctHandshake)
                        .addSupportedCommands(OwnCommand.newBuilder()
                                .setAlias("Идентификатор 1")
                                .setCaption("Заголовок 1")
                                .setDescription("Описание команды 1")
                                .addParameters(Parameter.newBuilder()
                                        .setAlias("Идентификатор команды 1")
                                        .setCaption("Заголовок команды 1")
                                        .setHint("Подсказка команды 1")
                                        .setValue(ValueRef.newBuilder()
                                                .setDataType(MessageEnumsProto.DataType.dtString)
                                                .setFormat("формат данных")
                                                .build())
                                        .build())
                                .addParameters(Parameter.newBuilder()
                                        .setAlias("Идентификатор команды 2")
                                        .setCaption("Заголовок 2 команды")
                                        .setHint("Подсказка команды 2")
                                        .setValue(ValueRef.newBuilder()
                                                .setDataType(MessageEnumsProto.DataType.dtString)
                                                .setFormat("формат данных")
                                                .build())
                                        .build())
                                .build())
                        .addSupportedCommands(OwnCommand.newBuilder()
                                .setAlias("Идентификатор 2")
                                .setCaption("Заголовок 2")
                                .setDescription("Описание команды 2")
                                .addParameters(Parameter.newBuilder()
                                        .setAlias("Идентификатор команды 1")
                                        .setCaption("Заголовок команды 1")
                                        .setHint("Подсказка команды 1")
                                        .setValue(ValueRef.newBuilder()
                                                .setDataType(MessageEnumsProto.DataType.dtString)
                                                .setFormat("формат данных")
                                                .setValue("test value")
                                                .build())
                                        .build())
                                .addParameters(Parameter.newBuilder()
                                        .setAlias("Идентификатор команды 2")
                                        .setCaption("Заголовок 2 команды")
                                        .setHint("Подсказка команды 2")
                                        .setValue(ValueRef.newBuilder()
                                                .setDataType(MessageEnumsProto.DataType.dtString)
                                                .setFormat("формат данных")
                                                .build())
                                        .build())
                                .build())
                        .build())
                .build();
        byte[] data = exchangeInfoMessage.toByteArray();
        out.write(data);
        out.flush();
        Thread.sleep(999999);
    }
}
