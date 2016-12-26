package dictionary;

import java.util.ArrayList;
import java.util.List;

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
  
  public List<String> correctWords(){
	  return this.words;
	  
  }

}
