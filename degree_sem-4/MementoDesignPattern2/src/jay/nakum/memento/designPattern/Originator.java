package jay.nakum.memento.designPattern;

public class Originator {

    private String article;

    public void setState(String article) {
        this.article = article;
    }

    public String getState() {
        return this.article;
    }

    public Article saveStateToMemento() {
        return new Article(article);
    }

    public void getStateFromMemento(Article article) {
        this.article = article.getArticle();
    }
}