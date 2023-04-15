/**
 * 
 */
package _01demo;

/**
 * @author Sai Karthik Malyala
 *
 */
public class Box<T> {
    private T content;
    
    public Box(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
    
    public void setContent(T content) {
        this.content = content;
    }
}
