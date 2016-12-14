package test;


public class File extends Search
{
	private String files;
	
	public File()
	{
		
	}
	public File(String files)
	{
		this.files=files;
	
	}
	public File(String files,String type)
	{
		this.files=files;
		
		setType(type);
	}
	public String getFile() 
	{
		return files;
	}
	public void setFile(String files) 
	{
		this.files = files;
	}
	public String getModel() 
	{
		return files;
	}
	public void setModel(String model) 
	{
		this.files = files;
	}
	public String toString()
	{
		return "\n"+getFile()+"\n";
	}
}

