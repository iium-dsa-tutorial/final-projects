import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class Filter implements FilenameFilter {

	private Pattern pattern; 
	
	//takes the pattern and search keyword from the FileSearchSystem class and compiles it
	public Filter(String reg) {
		pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
	}
	
	//filter the file/folder names containing the search keyword
	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(new File(name).getName()).matches();
	}

}
