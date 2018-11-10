package concurrency;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRunnable {

	public static void main(String[] args) {
		Runnable runnable =()->{
			try(BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/danielmastrovito/Documents/Lynda Exercises/Ex_Files_Java_EE_Concurrency/Exercise Files/Chapter2/02_03/begin/sample.txt")))){
				String line = null;
				while((line=reader.readLine())!=null) {
					System.out.println(Thread.currentThread().getName() + "reading the line: " + line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}

}
