package radiobutton;
/**
 * Created by c4q-sarahkim on 12/10/15.
 */
public class RadioButton
{

    private String name;
    private boolean isSelected;

    public RadioButton(String name, boolean isSelected) {
        this.name = name;
        this.isSelected = isSelected;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isSelected()
    {
        return isSelected;
    }

    public void setSelected(boolean isSelected)
    {
        this.isSelected = isSelected;
    }
}
