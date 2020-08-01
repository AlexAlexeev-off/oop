package ru.geekbrains.oop.les1.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.oop.les1.block.SearchTabsBlock;
import ru.geekbrains.oop.les1.page.content.base.ContentBasePage;

public class SearchPage extends ContentBasePage {

    private SearchTabsBlock searchTabsBlock;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.searchTabsBlock = new SearchTabsBlock(driver);
    }

    @Override
    public SearchPage openUrl() {
        driver.get("https://geekbrains.ru/search");
        return this;
    }

    public SearchTabsBlock getSearchTabsBlock() {
        return searchTabsBlock;
    }
}