package temp.main.io;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CSVWrite {

	public static void write(String path, ArrayList<HashMap<String, String>> data) throws Exception
	{
		PrintWriter pw = new PrintWriter(Paths.get("res/" + path).toFile());
		
		StringBuilder sb = new StringBuilder();
		
		for(String s : data.get(0).keySet())
		{
			sb.append(s + ",");
		}
		sb.setLength(sb.length() - 1);
		pw.println(sb.toString());
		
		for(Map<String, String> m : data)
		{
			sb = new StringBuilder();
			for(String s : m.keySet())
			{
				sb.append(m.get(s) + ",");
			}
			sb.setLength(sb.length() - 1);
			pw.println(sb.toString());
		}
		
		pw.close();
		
	}
}
