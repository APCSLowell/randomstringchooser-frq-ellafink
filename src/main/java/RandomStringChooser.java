import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> words;

  public RandomStringChooser(String [] wordList){
    words = new ArrayList<String>();
    for(int i = 0; i<wordList.size(); i++)
      words.add(wordList[i]);
  }
  public String getNext(){
    if(wordList.size()>0)
      return words.remove((int)(Math.random()*words.size()));
    else
      return "NONE";
  }
}
