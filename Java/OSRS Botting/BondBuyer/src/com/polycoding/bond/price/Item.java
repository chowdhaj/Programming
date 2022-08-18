package com.polycoding.bond.price;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Item {

    private final String name;
    private final int id;
    private final int regularPrice;
    private final int lowPrice;
    private final int highPrice;

    public Item (final String name, final int id) {
        this.name = name;
        this.id = id;
        this.regularPrice = getRegularPrice().orElse(-1);
        this.lowPrice = getLowPrice().orElse(-1);
        this.highPrice = getHighPrice().orElse(-1);

    }

    public final String getName() { return name; }

    public final int getId() { return id; }

    public final int getRegular() { return regularPrice; }
    
    public final int getLow() { return lowPrice; }
    
    public final int getHigh() { return highPrice; }

    private Optional<Integer> getRegularPrice(){
        try {
            URL url = new URL("http://api.rsbuddy.com/grandExchange?a=guidePrice&i=" + id);
            URLConnection con = url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
            con.setUseCaches(true);
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String json = br.readLine();
            System.out.println(json);
            br.close();
            Matcher matcher = Pattern.compile("\"overall\"\\s*:\\s*(\\d*)").matcher(json);
            return matcher.find() ? Optional.of(Integer.parseInt(matcher.group(1))) : Optional.empty();
        } catch(Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
    
    private Optional<Integer> getLowPrice(){
        try {
            URL url = new URL("http://api.rsbuddy.com/grandExchange?a=guidePrice&i=" + id);
            URLConnection con = url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
            con.setUseCaches(true);
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String json = br.readLine();
            System.out.println(json);
            br.close();
            Matcher matcher = Pattern.compile("\"selling\"\\s*:\\s*(\\d*)").matcher(json);
            return matcher.find() ? Optional.of(Integer.parseInt(matcher.group(1))) : Optional.empty();
        } catch(Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
    
    private Optional<Integer> getHighPrice(){
        try {
            URL url = new URL("http://api.rsbuddy.com/grandExchange?a=guidePrice&i=" + id);
            URLConnection con = url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
            con.setUseCaches(true);
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String json = br.readLine();
            System.out.println(json);
            br.close();
            Matcher matcher = Pattern.compile("\"buying\"\\s*:\\s*(\\d*)").matcher(json);
            return matcher.find() ? Optional.of(Integer.parseInt(matcher.group(1))) : Optional.empty();
        } catch(Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
    
    public final String toString() {
        return String.format("Name: %s, ID: %d, Price: %d", name, id, regularPrice);
    }
}
