package dictionary;

import java.util.ArrayList;
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

}
