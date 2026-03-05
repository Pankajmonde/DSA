

    static boolean isAnagram(String a, String b) {
         a = a.toLowerCase();
    b = b.toLowerCase();

    if (a.length() != b.length()) {
        return false;
    }

    int[] count = new int[26];

    for (int i = 0; i < a.length(); i++) {
        count[a.charAt(i) - 'a']++;
        count[b.charAt(i) - 'a']--;
    }

    for (int c : count) {
        if (c != 0) {
            return false;
        }
    }

    return true;

    }

