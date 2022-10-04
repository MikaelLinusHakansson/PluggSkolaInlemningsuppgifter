package Udemy.Sec9.Exercise47;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    public List<String> write();
    public void read(List<String> savedValues);

}
