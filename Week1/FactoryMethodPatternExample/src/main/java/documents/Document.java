package documents;

public interface Document {
    void open();
    void save();
    String getType();
}