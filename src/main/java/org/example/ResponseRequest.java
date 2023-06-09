package org.example;

import ru.sovcombank.hackaton.proto.*;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ResponseRequest {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 8888);
        OutputStream out = socket.getOutputStream();
        ////////////////////////////////////////////////////////////////
        ExchangeInfoMessage exchangeInfoMessageStatus = ExchangeInfoMessage.newBuilder()
                .setHeader(Header.newBuilder()
                        .setMessageNum("1")
                        .setTimestamp(System.currentTimeMillis())
                        .setSender("NotNullTestService")
                        .setReceiver("NotNullServer")
                        .build())

                .setResponse(Response.newBuilder()
                        .setCommand(MessageEnumsProto.CommandType.ctExecCommand)
                        .setAnswerType(MessageEnumsProto.AnswerType.atAnswerOK)
                        .setStatus(Status.newBuilder()
                                .setAdvStatus(AdvInfo.newBuilder()
                                        .setCaption("Заголовок Родиона")
                                        .addFields(AdvInfoFieldRef.newBuilder()
                                                .setAlias("1")
                                                .setCaption("Заголовок поля Родиона")
                                                .setDataType(MessageEnumsProto.DataType.dtBoolean)
                                                .build())
                                        .addFields(AdvInfoFieldRef.newBuilder()
                                                .setAlias("2")
                                                .setCaption("Заголовок поля Родиона 2")
                                                .setDataType(MessageEnumsProto.DataType.dtString)
                                                .build())
                                        .addFields(AdvInfoFieldRef.newBuilder()
                                                .setAlias("3")
                                                .setCaption("Заголовок поля Родиона 3")
                                                .setDataType(MessageEnumsProto.DataType.dtInteger)
                                                .build())
                                        .addFields(AdvInfoFieldRef.newBuilder()
                                                .setAlias("4")
                                                .setCaption("Заголовок поля Родиона 4")
                                                .setDataType(MessageEnumsProto.DataType.dtFloat)
                                                .build())
                                        .addFields(AdvInfoFieldRef.newBuilder()
                                                .setAlias("5")
                                                .setCaption("Заголовок поля Родиона 5")
                                                .setDataType(MessageEnumsProto.DataType.dtDateTime)
                                                .build())
                                        .setData(AdvInfoData.newBuilder()
                                                .setFullOrIncrement(true)
                                                .addRows(DataRow.newBuilder()
                                                        .setRowIdent("1")
                                                        .setIncrementDelete(true)
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("1")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtBoolean)
                                                                        .setFormat("boolean")
                                                                        .setValue("true")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("2")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtString)
                                                                        .setFormat("text")
                                                                        .setValue("Значение Родиона 2")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("3")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtInteger)
                                                                        .setFormat("number")
                                                                        .setValue("3")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("4")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtFloat)
                                                                        .setFormat("number")
                                                                        .setValue("4,5")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("5")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtDateTime)
                                                                        .setFormat("date")
                                                                        .setValue("2022-12-05")
                                                                        .build())
                                                                .build())
                                                        .build())
                                                .addRows(DataRow.newBuilder()
                                                        .setRowIdent("6")
                                                        .setIncrementDelete(true)
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("6")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtBoolean)
                                                                        .setFormat("boolean")
                                                                        .setValue("false")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("7")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtString)
                                                                        .setFormat("text")
                                                                        .setValue("Значение Родиона 7")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("8")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtInteger)
                                                                        .setFormat("number")
                                                                        .setValue("8")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("9")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtFloat)
                                                                        .setFormat("number")
                                                                        .setValue("9")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("10")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtDateTime)
                                                                        .setFormat("date")
                                                                        .setValue("2022-11-04")
                                                                        .build())
                                                                .build())
                                                        .build())
                                                .addRows(DataRow.newBuilder()
                                                        .setRowIdent("11")
                                                        .setIncrementDelete(true)
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("11")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtBoolean)
                                                                        .setFormat("boolean")
                                                                        .setValue("false")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("12")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtString)
                                                                        .setFormat("text")
                                                                        .setValue("Значение Родиона 12")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("13")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtInteger)
                                                                        .setFormat("number")
                                                                        .setValue("13")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("14")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtFloat)
                                                                        .setFormat("number")
                                                                        .setValue("14")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("15")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtDateTime)
                                                                        .setFormat("date")
                                                                        .setValue("2022-15-05")
                                                                        .build())
                                                                .build())
                                                        .build())
                                                .addRows(DataRow.newBuilder()
                                                        .setRowIdent("16")
                                                        .setIncrementDelete(true)
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("16")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtBoolean)
                                                                        .setFormat("boolean")
                                                                        .setValue("false")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("17")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtString)
                                                                        .setFormat("text")
                                                                        .setValue("Значение Родиона 17")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("18")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtInteger)
                                                                        .setFormat("number")
                                                                        .setValue("18")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("19")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtFloat)
                                                                        .setFormat("number")
                                                                        .setValue("19")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("20")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtDateTime)
                                                                        .setFormat("date")
                                                                        .setValue("2021-10-03")
                                                                        .build())
                                                                .build())
                                                        .build())
                                                .addRows(DataRow.newBuilder()
                                                        .setRowIdent("21")
                                                        .setIncrementDelete(true)
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("21")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtBoolean)
                                                                        .setFormat("boolean")
                                                                        .setValue("true")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("22")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtString)
                                                                        .setFormat("text")
                                                                        .setValue("Значение Родиона 22")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("23")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtInteger)
                                                                        .setFormat("number")
                                                                        .setValue("23")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("24")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtFloat)
                                                                        .setFormat("number")
                                                                        .setValue("24")
                                                                        .build())
                                                                .build())
                                                        .addValues(DataFieldValue.newBuilder()
                                                                .setAlias("25")
                                                                .setValue(ValueRef.newBuilder()
                                                                        .setDataType(MessageEnumsProto.DataType.dtDateTime)
                                                                        .setFormat("date")
                                                                        .setValue("2012-12-12")
                                                                        .build())
                                                                .build())
                                                        .build())
                                                .build())
                                        .build())
                                .build())
                        .build())
                .build();
        //////////////////////////////////////////////////////////////
        byte[] data = exchangeInfoMessageStatus.toByteArray();
        out.write(data);
        out.flush();
        Thread.sleep(10000);
        socket.close();
    }

}
