package com.lawrence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
@MyAnno(str="try", val=10)
public class AutoResourceManagement {
	/**
	 * Copy the content of the src file to target file
	 * @param src
	 * @param target
	 */
	public static void copy(String src, String target)
	{
		try(InputStream in = new FileInputStream(src); OutputStream ou = new FileOutputStream(target))
		{
			int b;
			while((b=in.read())!=-1)
				ou.write(b);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
