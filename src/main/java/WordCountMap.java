
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public static Map<String, Integer> returnWordMap(String words){

        String[] arrStrings = words.split(" ");
        int count = 1;
        Map<String, Integer> accurance = new HashMap<String, Integer>();


        for(int i = 0; i < arrStrings.length; i++){
            if(count > 1)
                count = 1;
            for(int j = 0; j < arrStrings.length; j++){
                if(j == i)
                    continue;
                
                if(arrStrings[i].compareTo(arrStrings[j]) == 0)
                    count++;
            }
            accurance.put(arrStrings[i], count);
        }
        
        return accurance;
    }

    public static void main(String[] args){
        
        System.out.println(returnWordMap("giraffe zebra giraffe"));
    }
}
