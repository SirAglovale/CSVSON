package temp.main.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVRead {
	
	public static ArrayList<HashMap<String, String>> read(String path) throws IOException
	{
		ArrayList<String[]> lines = new ArrayList<String[]>();
		
		ArrayList<HashMap<String, String>> return_vals = new ArrayList<HashMap<String, String>>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(CSVRead.class.getResourceAsStream(path)));
		
		String s = br.readLine();
		
		while(s != null)
		{
			lines.add(s.split(","));
			s = br.readLine();
		}

		for(int i = 1; i < lines.size(); i++)
		{
			HashMap<String, String> current = new HashMap<String, String>();
			for(int j = 0; j < lines.get(0).length; j++)
			{
				current.put(lines.get(0)[j], lines.get(i)[j]);
			}
			return_vals.add(current);
		}
		
		return return_vals;
	}
}
