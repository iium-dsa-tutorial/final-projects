package test;


public class Folder extends Search
{
	private String files;
	
	public Folder()
	{
		
	}
	public Folder(String files)
	{
		this.files=files;
		
	}
	public Folder(String files,String type)
	{
		this.files=files;
		
		setType(type);
	}
	public String getFile() 
	{
		return files;
	}
	public void setFile(String manufacturer) 
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

