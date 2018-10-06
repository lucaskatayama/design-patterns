package memento;

public class Originator {

    private String article; // holds the current state

    public Originator() {
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public Memento save() {
        return new Memento(this.article);
    }

    public void restore (Memento memento) {
        this.article = memento.getState();
    }
}
