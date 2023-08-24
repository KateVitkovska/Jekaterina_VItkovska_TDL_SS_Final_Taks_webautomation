package pages.objects;

public class BasePageObject {
    public BasePageObject(String name, String locator, String value)
    {
        this.name = name;
        this.locator = locator;

    }
    public String getName()
    {
        return name;
    }

    public String getLocator()
    {
        return locator;
    }


    public void clearField()
    {
        getWebElement(getLocator()).clear();
    }
}

