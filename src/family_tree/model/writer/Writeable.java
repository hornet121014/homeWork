package family_tree.model.writer;

import java.io.Serializable;

public interface Writeable {
    boolean save(Serializable serializable, String filePath);
    Object read(String filePath);
}
