package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private final Key content;
    private boolean isCovered = true;

    /**
    * default constructor.
    * @param key retrieve's the key and it's level.
    */
    public HoleContent(Key key) {
        this.content = key;
    }

    public Key getKey() {
        return content;
    }

    public void setIsCovered(boolean covered) {
        isCovered = covered;
    }

    public boolean isCovered() {
        return isCovered;
    }


}
