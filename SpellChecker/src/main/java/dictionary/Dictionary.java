package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * The correct words are stored here.
 */
public class Dictionary {
	
  public List<String> words= new ArrayList<String>();
  
  public Dictionary(){
	  words.add(" kathmandu");
	  words.add("   pokhara");
	  words.add("biratnagar");
	  words.add("   birgunj");
	  words.add("   baglung");
	  words.add("    butwal");
  }
  
  /*
   * @return list List of correct words.
   */
  
  public List<String> correctWords(){
	  return this.words;
	  
  }
  
  /*
   * This method returns all the words with their corresponding edit distance from the file.
   * 
   * @param String The filename which is to be read for correct spelling.
   * @return list The list of all the words.
   */
  
  public List<String> dictionaryFile(String filename) throws IOException{
	  List<String> words= new ArrayList<String>();
	  File wordsFile= new File(filename);
	  FileReader fr= new FileReader(wordsFile);
	  BufferedReader br = new BufferedReader(fr);
	  String line;
	  while((line=br.readLine())!=null){
		  String ln= line.replaceAll("([,.-?']+)", "");
		  String[] split= ln.split("\\s+");
			  words.addAll(Arrays.asList(split));
		  
	  }
	  return words;
	  
  }

}
