package test;


public class FolderArray 
{
	private static Folder[] listP;
	private static int count;
	//no-args constructor
	public FolderArray()
	{
		listP = new Folder[20];
		count = 0;
	}
	//user inputs the size
	public FolderArray(int size)
	{
		listP=new Folder[size];
		count=0;
	}
	//adding new cars to the collection
	public static void addCars (String files,String type) 
	{
			if (count == listP.length)
			increaseSize();
			listP[count] = new Folder (files,type);
			count++;
	}
	//description of the list
	public String toString() 
	{
		String report = "\n";
		for (int i = 0; i < count; i++)
		report += listP[i].toString() + "\n";
		return report;
	}
	//increasing the size of array
	private static void increaseSize ()
	{
	Folder[] temp = new Folder[listP.length * 2];
	for (int i = 0; i < listP.length; i++)
	temp[i] = listP[i];
	listP = temp;
	}
	//method to search model in the collection
	public int searchModel(String search)
	{
		int index=-1;
		for(int i=0;i<count;i++)
		{
			if(listP[i].getModel().equalsIgnoreCase(search))
			index=i;
		}
		return index;
	}
	public String display(int index)
	{
		String report="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report+="Search Result\n\n";
		for(int i=0;i<listP.length;i++)
		{
			if(i==index)
				report+=listP[index].toString() +"\n";
		}
		return report+="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
	}
	public String inventory()
	{
		String report="";
		for (int i = 0; i < count; i++)
		report += listP[i].toString();
		return report;
	}
}
