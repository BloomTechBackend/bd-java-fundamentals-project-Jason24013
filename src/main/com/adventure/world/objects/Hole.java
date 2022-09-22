package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

import java.util.List;

public class Hole {

    private List<HoleContent> holecontent;


    private HoleContent hc = new HoleContent(null);
    private  Key key;

    private boolean ic;


    /**
     * Creates a hole with the given content.
     * @param content - the item that is covered by the hole.
     */
    public Hole(Key content) {
key = content;
    }

    public boolean isCovered() {
        //TODO This value should come from HoleContent
        return hc.isCovered();
    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {
        //TODO this function should update HoleContent's isCovered property.
        hc.setIsCovered(ic);

    }



    /**
     * If the HoleContent is uncovered, return the key. Otherwise, return null.
     * @return the key if the hold is uncovered.
     */
    private Key getKeyIfPossible() {
        //TODO Get the HoleContent's content only if the hole is uncovered.
        return hc.getKey();
    }




    /**
     * If the HoleContent is uncovered, return the content. Otherwise, return null.
     * @return - the content if the hole is uncovered.
     */
    public Tangible getContent() {
        return getKeyIfPossible();
    }

    public Key getKey() {
        return key;
    }

    public List<HoleContent> getHolecontent() {
        return holecontent;
    }
}
