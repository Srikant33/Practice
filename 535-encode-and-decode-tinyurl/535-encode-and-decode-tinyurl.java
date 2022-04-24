public class Codec {
    HashMap<Integer, String > hm = new HashMap<>();
    int i=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        i++;
        hm.put(i,longUrl);
        // System.out.println(Integer.toString(i));
        return Integer.toString(i);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // System.out.println(shortUrl.replace("htpp://tinyurl.com/",""));
        return hm.get(Integer.parseInt(shortUrl.replace("htpp://tinyurl.com/","")));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));