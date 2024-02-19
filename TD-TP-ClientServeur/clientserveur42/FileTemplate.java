package clientserveur42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

public class FileTemplate {

	public static void createResponseFromTemplate(String path, HashMap<String,String>templateDatas, OutputStream os) throws IOException {
				// Création d'un fileReader pour lire le fichier
				File file = new File(path);
				System.out.println(file.getAbsolutePath());
				FileReader fileReader = new FileReader(file);

				// Création d'un bufferedReader qui utilise le fileReader
				BufferedReader reader = new BufferedReader(fileReader);
				String line = reader.readLine();
				while (line != null) {
					if (templateDatas != null) {
						for(String clefs : templateDatas.keySet())
						if (line.contains(clefs)) {
							String line2 = line.replace(clefs, templateDatas.get(clefs));
							os.write(line2.getBytes());
						}
					} else
						os.write(line.getBytes());
					
					// lecture de la prochaine ligne
					line = reader.readLine();
				}
				
				reader.close();
	}
	
	

}
