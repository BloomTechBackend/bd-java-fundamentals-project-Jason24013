package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
        private Key content;
        private  boolean isCovered = true;



        public HoleContent(Key key)
        {
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
