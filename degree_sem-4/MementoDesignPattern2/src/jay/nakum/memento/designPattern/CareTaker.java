package jay.nakum.memento.designPattern;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Article> versionControl = new ArrayList<Article>();
    
    public void add(Article article) {
        
        versionControl.add(article);
    }

    public Article get(int index) {
        return versionControl.get(index);
    }
}
