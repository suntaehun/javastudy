package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			File file = new File("phone.txt");
			
			if(!file.exists()) {
				System.out.println("file not found");
				return;
			}
			
			System.out.println("==========파일정보==========");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-d HH:mm:ss").format(file.lastModified()));
			
			System.out.println("==========전화번호==========");
			
			// 1. 기반 스트림
			FileInputStream fs = new FileInputStream(file);
			
			// 2. 보조 스트림1
			InputStreamReader isr = new InputStreamReader(fs, "utf-8");
			
			// 3. 보조 스트림2
			br = new BufferedReader(isr);
			
			// 4. 처리
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(IOException ex) {
			System.out.println("Error : " + ex);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
