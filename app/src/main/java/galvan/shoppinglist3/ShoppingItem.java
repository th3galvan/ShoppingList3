package galvan.shoppinglist3;

/**
 * Created by Galvan on 23/10/2017.
 */

public class ShoppingItem {
    private String text;
    private boolean checked;


    public ShoppingItem(String text) {
        this.text = text;
    }

    public ShoppingItem(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void toggleChecked() {
        this.checked = !this.checked;

    }
}