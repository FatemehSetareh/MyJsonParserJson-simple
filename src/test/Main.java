package test;

import java.io.IOException;

/**
 * Created by ${Dotin} on ${4/25/2015}.
 */
public class Main {
    public static void main(String[] args) {
        MyJsonParser jsonParser = new MyJsonParser("core.json");
        try {
            jsonParser.parseJson();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
