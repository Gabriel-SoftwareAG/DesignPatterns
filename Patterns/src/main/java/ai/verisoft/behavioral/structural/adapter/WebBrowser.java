package ai.verisoft.behavioral.structural.adapter;

public interface WebBrowser {
    void navigate(String url);
    void click(String selector);
    void type(String selector, String text);
    void close();
}
