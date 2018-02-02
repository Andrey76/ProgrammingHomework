package Practice2String1;

import lombok.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andr_ on 31.01.2017.
 */
public class TreatmentDocument {
       public static String readFromFile(String path, String charSet) {
           StringBuilder sb = new StringBuilder();
           try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), charSet))) {
            java.lang.String s = null;
               while ((s = br.readLine()) != null){
                   sb.append(s).append("\n");
               }
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }
           return sb.toString();
       }
    @Data
    public static class Rank {
        private String rank;
        private String maleName;
        private String femaleName;
        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }
        public String getMaleName() {return maleName;
        }
        public void setMaleName(String maleName) {
            this.maleName = maleName;
        }
        public String getFemaleName() {return femaleName;
        }
        public void setFemaleName(String femaleName) {
            this.femaleName = femaleName;
        }
    }

    public static List<Rank> parsRank(String path, String charSet, String regex){
        List<Rank> rankList = new ArrayList<>();
        String html = readFromFile(path, charSet);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        Rank rank = null;
        while (matcher.find()){
            rank = new Rank();
            rank.setRank(matcher.group("rank"));
            rank.setMaleName(matcher.group("maleName"));
            rank.setFemaleName(matcher.group("femaleName"));
            rankList.add(rank);
        }
        return rankList;
    }
}
