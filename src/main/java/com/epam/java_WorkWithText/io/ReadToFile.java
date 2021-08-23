package com.epam.java_WorkWithText.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadToFile {
    public static final String path= "./src/main/java/com/epam/java_WorkWithText/resources/";
    public void  toFile(String filePath,String text){
        try (RandomAccessFile accessFile = new RandomAccessFile(
                new StringBuilder(path)
                        .append(filePath).toString(), "rw");
             FileChannel channel = accessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
