import java.util.Collections;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Santa {
    List<String> secretSanta() throws IOException {
        //Enter names here. Example provided.
        List<String> names = Arrays.asList("Tom", "Jerry", "Mark", "Fido");
        //Function in Java Standard Library (OpenJDK) that performs random shuffling
        Collections.shuffle(names);
        
        return names;
    }

    public static void main(String[] arg) {
        Santa newSanta = new Santa();
        try {
            System.out.println(newSanta.secretSanta());
        } catch (IOException e) {
            System.err.println("Something went wrong:" + e);
        }
   }
}
