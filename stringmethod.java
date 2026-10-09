public class stringmethod {
    public static void main(String[] args) {
        String q= " tashi";
        String r = "SHERPA";
        System.out.println(q.toUpperCase());
        System.out.println(r.toLowerCase());

        System.out.println(r.concat(q));
        System.out.println(q.length());

        String k = "   namche Bazar     ";
        String j ="";
        String h ="learn coding";

        System.out.println(k.trim());
        System.out.println(j.isEmpty());

        System.out.println(h.isEmpty());

        System.out.println(q.charAt(3));
        System.out.println(h.indexOf('n'));
        System.out.println(h.indexOf(' '));

        System.out.println(h.equals(k));
        System.out.println(h.replace('g','d'));
    }
    
}
