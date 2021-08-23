package com.epam.java_WorkWithText.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFromFile {
    public static final String path= "./src/main/java/com/epam/java_WorkWithText/resources/";
    public String fromFile(String filePath) {
        StringBuilder text = new StringBuilder();
        try (RandomAccessFile accessFile = new RandomAccessFile(
                new StringBuilder(path)
                        .append(filePath).toString(), "r");
             FileChannel channel = accessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(10);
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    text.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}
