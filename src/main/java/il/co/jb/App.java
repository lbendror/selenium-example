package il.co.jb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class App {
	public static void main( String[] args ) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("json/json_array.json"));
		String line;
		
		StringBuilder sb = new StringBuilder();
		
		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}

		br.close();

		String fileContent = sb.toString();
		
		Gson gson = new Gson();
		
		ArrayList<Client> clients = gson.fromJson(fileContent, new TypeToken<List<Client>>(){}.getType());
		
		for (Client client : clients) {
			System.out.println(client);
		}
	}
}
