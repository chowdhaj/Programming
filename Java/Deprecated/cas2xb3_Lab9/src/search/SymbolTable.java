package search;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class SymbolTable {

    private HashMap st = new HashMap();

    public void put(String key, Object value) { st.put(key, value);   }
    public Object get(String key)             { return st.get(key);   }
    public String toString()                  { return st.toString(); }

    // Return an array contains all of the keys

    public String[] keys() {
        Set keyvalues = st.entrySet();
        String[] keys = new String[st.size()];
        Iterator it = keyvalues.iterator();
        for (int i = 0; i < st.size(); i++) {
            Map.Entry entry = (Map.Entry) it.next();
            keys[i] = (String) entry.getKey();
        }
        return keys;
    }


   /***********************************************************************
    * Test routine.
    **********************************************************************/

    public static void main(String[] args) {

        SymbolTable st = new SymbolTable();

        // Create metro stations ....
    }
}