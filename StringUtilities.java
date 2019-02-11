
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        return new StringBuffer(valueToBeReversed).reverse().toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int length = word.length();
        int i;
        if(length % 2 == 0) {
            i =((length/2)-1);
        }
        else {
          i = length / 2;   
        }
        return word.charAt(i);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String removedChar = charToRemove.toString();
        String newValue = value.replaceAll(removedChar, "");
        return newValue;
        
        /*int length = value.length();
        String space = "";
        
        for( int i =0; i < length; i++) {
            if (value.charAt(i) != charToRemove) {
             return space = space + value.charAt(i);
            }
            return space;
        }
        return space; */
        
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        int length = sentenceArray.length;
        return sentenceArray[length -1];
    }
}
