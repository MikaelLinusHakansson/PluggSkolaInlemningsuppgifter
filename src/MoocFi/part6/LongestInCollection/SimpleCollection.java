package MoocFi.part6.LongestInCollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public  String longest(){
        String longest = "";
        for (String element : elements) {
            if(longest.length() < element.length()) {
                longest = element;
            }
        }
        if (longest.length() > 0) {
            return longest;
        } return null;

    }
}
