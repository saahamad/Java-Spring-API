package com.files;

import java.io.IOException;
import java.io.PrintWriter;

public class RandomAccess {

	public static void main(String[] args) throws IOException {
		
/*RandomAccessFile file = new RandomAccessFile("/home/saahamad/Desktop/file.txt", "rw");
		
		file.seek(0);
		file.writeUTF("Hello all!Have a great day...");	
		file.close();
		System.out.println("Data written to file..");
		
RandomAccessFile filereader = new RandomAccessFile("/home/saahamad/Desktop/file.txt", "rws");
		filereader.seek(10);
		String data = null;
		int count = 0;
		while((data = filereader.readLine()) != null) {
		System.out.println(data);
		count++;
		}
		System.out.println("Total lines:"+count);
		filereader.close();
		*/
		
		String name="Sarfaraz";
		String addr = "Pune";
		int id = 1001;
		
	PrintWriter writer = new PrintWriter("/home/saahamad/Desktop/file.txt");
			
		writer.format("\n Name is:  %s", name);
		writer.format("\n Addr is:  %s", addr);
		writer.format("\n IDNO is:  %s", id);
		writer.close();
		System.out.println("Data written to file..");
		
		//For data writting...
		
		/*FileWriter fw = new FileWriter("/home/saahamad/Desktop/file.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This is buffered writer......");
		bw.close();
		fw.close();
		System.out.println("Data written to file..");
		*/
		// For data reading...more than one line
		
		/*FileReader fr = new FileReader("/home/saahamad/Desktop/file.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int wordcount = 0;
		while((line = br.readLine()) != null)
		{
			StringTokenizer token = new StringTokenizer(line);
			
				while (token.hasMoreElements()) {				
					System.out.println(token.nextToken());
					wordcount++;
				}
		}
		System.out.println("Total words are:"+wordcount);
	*/
	}
	}