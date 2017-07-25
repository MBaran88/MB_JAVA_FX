import java.util.List;

public interface IDAO<T extends Bean> {
    List<T> get();
    void add(T beam);
    void update(T beam);
    void delete (T beam);
}
