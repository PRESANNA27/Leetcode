/*strs = ["flower","flow","flight"]

prefix = "flower"

Compare with "flow"

"flow" starts with "flower"? ❌

Remove last letter

prefix = "flowe"

Again ❌

prefix = "flow"

Again ✅

-----------------

Compare with "flight"

"flight" starts with "flow"? ❌

prefix = "flo"

❌

prefix = "fl"

✅

Answer = "fl"*/





class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }
}
