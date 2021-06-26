import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    static List<String> translate(String rnaSequence) {

        //List of proteines.
        List<String> rnaList = new ArrayList<String>();

        //Create a hashmap and map all the proteines to the codons. Possible TODO - map several values to one codon
        HashMap<String, String> proteinMap = new HashMap<String, String>();

        proteinMap.put("AUG", "Methionine");
        proteinMap.put("UUU", "Phenylalanine");
        proteinMap.put("UUC", "Phenylalanine");
        proteinMap.put("UUA", "Leucine");
        proteinMap.put("UUG", "Leucine");
        proteinMap.put("UCU", "Serine");
        proteinMap.put("UCC", "Serine");
        proteinMap.put("UCA", "Serine");
        proteinMap.put("UCG", "Serine");
        proteinMap.put("UAU", "Tyrosine");
        proteinMap.put("UAC", "Tyrosine");
        proteinMap.put("UGU", "Cysteine");
        proteinMap.put("UGC", "Cysteine");
        proteinMap.put("UGG", "Tryptophan");
        proteinMap.put("UAA", "STOP");
        proteinMap.put("UAG", "STOP");
        proteinMap.put("UGA", "STOP");

        //Check all the substrings and add to the list with a stop condition
        for (int i = 0; i < rnaSequence.length() - 2; i += 3) {
            if (proteinMap.get(rnaSequence.substring(i, i + 3)).equals("STOP")) {
                break;
            }
            rnaList.add(proteinMap.get(rnaSequence.substring(i, i + 3)));
        }

        return rnaList;
    }

}
