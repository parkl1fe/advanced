package task3;

import static task3.DnsProvider.CLOUDFLARE;
import static task3.DnsProvider.GOOGLE;

public class Main {
    public static void main(String[] args) {
        Mapping<DnsProvider, DnsServer> dnsMap = new Mapping<>();
        dnsMap.add(GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMap.add(CLOUDFLARE, new DnsServer("1.1.1.1", "1.0.0.1"));
        // ...
        System.out.println(dnsMap.get(GOOGLE));
        Mapping<String, String> dictionaryMap = new Mapping<>();
        dictionaryMap.add("Labas", "Hello");
        dictionaryMap.add("Pasaulis", "World");
        // ...
        System.out.println(dictionaryMap.get("Labas"));

    }
}
