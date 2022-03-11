package jay.nakum.memento.designPattern;

public class Originator {

    private String article;

    public void set(String article) {
        this.article = article;
    }

    public String get() {
        return this.article;
    }

    public Article saveToMemento() {
        return new Article(article);
    }

    public String getFromMemento(Article article) {
        this.article = article.getArticle();
        
        return this.article;
    }
}