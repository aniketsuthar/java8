package com.example.fileutils;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Collectors;

public class FileUtilities {
	public static void main(String[] args) {
		try (RandomAccessFile aFile = new RandomAccessFile("/home/aniket/Desktop/res.txt", "r");
				FileChannel channel = aFile.getChannel();) {
			Files.lines(Paths.get("/home/aniket/Desktop/res.txt")).collect(Collectors.toList())
					.forEach(System.out::println);

			Files.copy(Paths.get("/home/aniket/Desktop/res.txt"), Paths.get("/home/aniket/Desktop/res1.txt"),
					StandardCopyOption.REPLACE_EXISTING);
			Files.list(Paths.get("/home/aniket/Desktop")).forEach(System.out::println);

			ByteBuffer buffewr = ByteBuffer.allocate(1024);
			int read = channel.read(buffewr);
			buffewr.flip();
			System.out.println(buffewr.getChar());
			buffewr.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
