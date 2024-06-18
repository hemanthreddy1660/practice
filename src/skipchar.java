public class skipchar {
    public static void main(String[] args) {
        System.out.println(skip3("","applebbappcc"));
    }
    static void skip(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char c = unprocessed.charAt(0);
        if(c=='a'){
            skip(processed,unprocessed.substring(1));
        }else{
            skip(processed+c,unprocessed.substring(1));
        }
    }
    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }
        char c = up.charAt(0);
        if(c=='a'){
           return  skip1(up.substring(1));
        }else{
            return c+skip1(up.substring(1));
        }
    }
    static String skip2(String p,String up) {
        if (up.isEmpty()) {
            return p;
        }
        if (up.startsWith("apple")) {
            return skip2(p, up.substring(5));
        } else{
            return up.charAt(0) + skip2(p, up.substring(1));
        }
    }
    static String skip3(String p,String up) {
        if (up.isEmpty()) {
            return p;
        }
        if (up.startsWith("app")&&!up.startsWith("apple")) {
            return skip3(p, up.substring(3));
        } else{
            return up.charAt(0) + skip3(p, up.substring(1));
        }
    }
}
