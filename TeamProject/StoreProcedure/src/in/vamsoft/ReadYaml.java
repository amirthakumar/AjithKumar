package in.vamsoft;

import java.io.FileNotFoundException;

import org.ho.yaml.Yaml;
import org.ho.yaml.YamlStream;

import in.vamsoft.model.DbProp;

public class ReadYaml {

	
	public static void main(String[] args) {
		
		Yaml details=new Yaml();
		try {
			YamlStream<DbProp> stream=Yaml.loadStreamOfType("dbyml.yml", DbProp.class);
			stream.forEach(System.out::println);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}
	
	
}
