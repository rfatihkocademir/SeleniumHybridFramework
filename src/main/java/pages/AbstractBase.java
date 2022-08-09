package pages;

import org.openqa.selenium.By;

public abstract class AbstractBase {
    //define methods here

    public abstract void openWebsite(String url);
    public abstract void click(By element);
    public abstract void getText(By element);
    public abstract void enterInput(By element, String email);
    public abstract void isExist(By element);
    public abstract void titleCheck(String browserTitle);
    public abstract void TextAssertion(By element, String string);
    public abstract void checkList(By element);
    public abstract void hitEnter(By element);
    public abstract void InputClear(By element);
    public abstract void checkUrl(String url);

}
