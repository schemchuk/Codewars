package org.example.dan7;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

public class MixedSum {

    public int sum(List<?> mixed) {
        int total = 0;

        for(Object s: mixed){
            total+=Integer.parseInt(s.toString());
        }

        return total;
    }
}

