package com.iopackage.q1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileFromSrcToDest {

	private String source;
	private String dest;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}

	public void CopyFileFromSrcToDest(String source, String dest) {
		//super();
		this.source = source;
		this.dest = dest;
		
		try(FileInputStream is = new FileInputStream(source);
			BufferedInputStream bin = new BufferedInputStream(is);
			FileOutputStream os = new FileOutputStream(dest);
				BufferedOutputStream bout = new BufferedOutputStream(os);
				)
		{
			byte[] arr = new byte[1024];
			int count = 0;
			
			while((count = bin.read(arr))>0)
			{
				bout.write(arr , 0, count);
			}
				
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	}
}
