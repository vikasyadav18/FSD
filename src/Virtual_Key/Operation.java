package Virtual_Key;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Operation 
{

	void ListAllFiles(String path)
	{
		if(path!=null)
		{
		File dir=new File(path);
		
		List<String> FileList=Arrays.asList(dir.list());
		System.out.println(FileList);
		}
		else
		{
			System.out.println("path not found");
		}
	}
		
	
	void CreateFile(String path,String fileName) throws IOException
	{
		File newfile=new File(path + File.separator + fileName);
		
		try {
			newfile.createNewFile();
			System.out.println("file named : "+fileName +" is created at path : "+ path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	void deleteFile(String path, String fileName)
	{
		File newfile=new File(path + File.separator + fileName);
		
		boolean status=newfile.delete();
		if(status)
		{
			System.out.println("file is deleted Successfully");
		}
		else
		{
			System.out.println("unable in deleting file");
		}
	}
	
	
	void searchfile(String path,String fileName)
	{
		File dir=new File(path);
		
		List<String> FileList=Arrays.asList(dir.list());
		
		if(FileList.contains(fileName))
		{
			System.out.println("file named : "+fileName+" is exist in the above directory : "+ path );
		}
		else {
			System.out.println("file not found");
		}
		//System.out.println(Arrays.toString(FileList));
	}
	
	

}
