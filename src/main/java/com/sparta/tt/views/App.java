package com.sparta.tt.views;

import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, IOException {
            Loader.takeInput();
            Loader.writeToFile();
    }
}
