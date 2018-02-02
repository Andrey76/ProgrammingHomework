package Practice2String1;

import java.util.List;

/**
 * Created by andr_ on 31.01.2017.
 */
public class App {
    public static void main(String[] args) {
        String regexRank = "<td>(?<rank>\\d+)</td><td>(?<maleName>\\w+)</td><td>(?<femaleName>\\w+)</td>";
        List<TreatmentDocument.Rank> rankList = TreatmentDocument.parsRank("baby2008.html", "utf-8", regexRank);
        rankList.forEach(System.out::println);

    }
}
