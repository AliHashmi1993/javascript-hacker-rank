import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BalanceParenthesis {
    BalanceParenthesis() {
        String st = "()))";

        List<Character> charIns = new ArrayList<>();
        for (int i = 0; i <st.length(); i++) {
            if (st.charAt(i) == '(') {
                System.out.println("Opening Bracket");
                charIns.add('(');
            }
            if (st.charAt(i) == ')') {
                System.out.println("Closing Bracket");

            }
        }
        System.out.println(charIns.size());
    }
}