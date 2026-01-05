package QueueAndList.QueueBasics.Q3.EmptyHandling;

public class Item {

    private String itemId;
    private String itemName;

    public Item(String itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "\nItem ID: "+itemId+
                "\nItem name: "+itemName;
    }
}
