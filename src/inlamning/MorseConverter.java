package inlamning;

import java.util.HashMap;
import java.util.Map;

public class MorseConverter {

    private static final Map<Character, String> engToMors = new HashMap<>();
    private static final Map<String, Character> morseToEng = new HashMap<>();

    static {
        // Klass för att konvertera moreskod
        engToMors.put('A', ".-");
        engToMors.put('B', "-...");
        engToMors.put('C', "-.-.");
        engToMors.put('D', "-..");
        engToMors.put('E', ".");
        engToMors.put('F', "..-.");
        engToMors.put('G', "--.");
        engToMors.put('H', "....");
        engToMors.put('I', "..");
        engToMors.put('J', ".---");
        engToMors.put('K', "-.-");
        engToMors.put('L', ".-..");
        engToMors.put('M', "--");
        engToMors.put('N', "-.");
        engToMors.put('O', "---");
        engToMors.put('P', ".--.");
        engToMors.put('Q', "--.-");
        engToMors.put('R', ".-.");
        engToMors.put('S', "...");
        engToMors.put('T', "-");
        engToMors.put('U', "..-");
        engToMors.put('V', "...-");
        engToMors.put('W', ".--");
        engToMors.put('X', "-..-");
        engToMors.put('Y', "-.--");
        engToMors.put('Z', "--..");

        // morsekod till engelska
        for (Map.Entry<Character, String> entry: engToMors.entrySet() ){
            morseToEng.put(entry.getValue(),entry.getKey());
        }


    }
    public String toMorse(String eng){
        StringBuilder mors = new StringBuilder();
        for (char c : eng.toUpperCase().toCharArray()){
            if (engToMors.containsKey(c)){
                mors.append(engToMors.get(c)).append(" ");

            }else {
                throw new IllegalArgumentException("Invalid character:" + c);
            }
        }
        return mors.toString().trim();
    }
    public String toEnglish(String morse){
        StringBuilder eng = new StringBuilder();
        String[] morseCodes = morse.split(" ");

        for (String code : morseCodes){
            if (morseToEng.containsKey(code)){
                eng.append(morseToEng.get(code));
            }else {
                throw new IllegalArgumentException("Fel: Lägg in text!:" + code);
            }
        }
        return eng.toString();
}
}
