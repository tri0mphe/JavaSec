package com.tri0mphe;

import java.io.IOException;

public class Virus {
    static {
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
