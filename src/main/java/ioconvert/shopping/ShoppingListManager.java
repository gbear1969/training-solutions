package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {
/*
    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os))) {
            for (String str : shoppingList) {
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }

    public List<String> loadShoppingList(InputStream is) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }*/


    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try (PrintStream outputStream = new PrintStream(
                new BufferedOutputStream(os))) {
            for (String item: shoppingList) {
                outputStream.println(item);
            }
        }
    }

    public List<String> loadShoppingList(InputStream is) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while((line = reader.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }
}
