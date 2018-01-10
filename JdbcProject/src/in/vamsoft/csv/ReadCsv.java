package in.vamsoft.csv;


import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.log4j.Logger;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameMappingStrategy;

public class ReadCsv {

  public static Logger logger=Logger.getLogger(ReadCsv.class);
  public static void main(String[] args) {
    
    try {
      CSVReader reader=new CSVReader(new FileReader("/home/vamsoft/Desktop/populationdata.csv"));
      HeaderColumnNameMappingStrategy<Population> strategy=new HeaderColumnNameMappingStrategy<>();
      strategy.setType(Population.class);
      CsvToBean<Population> bean=new CsvToBean<>();
      
      
    
    
    
    
    
    } catch (FileNotFoundException e) {
    
      logger.error("The File is Not Found",e);
    }
    
       
    
  }
  
}
