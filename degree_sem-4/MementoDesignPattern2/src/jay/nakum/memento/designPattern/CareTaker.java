package jay.nakum.memento.designPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private ArrayList<Map<String, Article>> versionControl = new ArrayList<Map<String, Article>>();
    
    public void add(String commitMsg, Article article) {
        Map<String, Article> articleMap = new HashMap<String, Article>();
        articleMap.put(commitMsg, article);
        
        versionControl.add(articleMap);
    }

    public Map<String, Article> get(int commitCode) {
        return versionControl.get(commitCode);
    }
}
