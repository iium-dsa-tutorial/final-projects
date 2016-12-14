package test;


public class FileArray 
{
	private static File[] listH;
	private static int count;
	//no-args constructor
	public FileArray()
	{
		listH = new File[20];
		count = 0;
	}
	//user inputs the size
	public FileArray(int size)
	{
		listH=new File[size];
		count=0;
	}
	//adding new cars to the collection
	public static void addCars (String files,String type) 
	{
			if (count == listH.length)
			increaseSize();
			listH[count] = new File(files,type);
			count++;
	}
	//description of the list 
	public String toString() 
	{
		String report = "\n";
		
		for (int i = 0; i < count; i++)
		report += listH[i].toString() + "\n";
		return report;
	}
	//increasing the size of array
	private static void increaseSize ()
	{
		File[] temp = new File[listH.length * 2];
	for (int i = 0; i < listH.length; i++)
	temp[i] = listH[i];
	listH = temp;
	}
	//method to search model in the collection
	public int searchModel(String search)
	{
		int index=-1;
		for(int i=0;i<count;i++)
		{
			if(listH[i].getModel().equalsIgnoreCase(search))
			index=i;
		}
		return index;
	}
	public String display(int index)
	{
		String report="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report+="Search Result\n\n";
		for(int i=0;i<listH.length;i++)
		{
			if(i==index)
				report+=listH[index].toString() +"\n";
		}
		return report+="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
	}
	public String inventory()
	{
		String report="";
		for (int i = 0; i < count; i++)
		report += listH[i].toString();
		return report;
	}
}
