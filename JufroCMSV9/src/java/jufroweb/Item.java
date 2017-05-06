package jufroweb;

import java.util.LinkedList;
import java.util.List;

public class Item {

    private String opc;
    private String link;
    public static int HTML = 0;
    public static int JSP = 1;
    public static int CONTENT = 2;
    private int tipoContent;
    private List<Item> subMenus = new LinkedList<Item>();

    public Item(String opc, String link, int tipoContent) {
        switch (tipoContent){
            case 2: 
                this.link = "index.jsp?content=" + link;
            break;
            case 1:
                this.link= link;
            break;
            case 0:
                this.link="index.jsp?htmlFile=" + link;
            break;
        }

        this.tipoContent = tipoContent;
        this.opc = opc;
        
    }

    public String getOpc() {
        return opc;
    }

    public void setOpc(String opc) {
        this.opc = opc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHtml() {
        String html = "";
        if (subMenus.isEmpty()) {
            html = "<a href=\"" + link + "\" title=\"lnk\">" + opc + "</a>";
        } else {
            html = "<a href=\"" + link + "\" title=\"lnk\">" + opc + "</a>";
            html += "<div class=\"menu\"><ul>";
            for (Item menu : subMenus) {
                html += "<li>" + menu.getHtml() + "</li>";
            }

            html += "</ul></div>";
        }

        return html;
    }

    public void addSubMenuItem(Item item) {
        subMenus.add(item);
    }

    public List<Item> getSubMenu() {
        return subMenus;
    }
}
