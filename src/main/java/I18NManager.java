import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private  static I18NManager instance;
    private HashMap<String, ResourceBundle> data;

    private I18NManager(){
        this.data = new HashMap<String, ResourceBundle>();
    }

    public static I18NManager getInstance(){
        if (instance==null){
            instance = new I18NManager();
        }
        return instance;
    }

    public void clear() {
    }

    public String getText(String idioma, String key) {
        ResourceBundle rb = this.data.get(key);
        if (rb==null){
            rb = ResourceBundle.getBundle(idioma);
            this.data.put(idioma,rb);
        }
        return rb.getString(key);
    }
}
