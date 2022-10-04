package Udemy.Sec9.Exercise49;

import java.util.List;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }


}
