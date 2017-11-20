package com.flowergarden.store;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.flowers.Rose;
import com.flowergarden.properties.FreshnessInteger;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class StoreRefregerator {

    private Map<String, Deque<GeneralFlower>> store = new HashMap<>();

    static private StoreRefregerator instance = new StoreRefregerator();

    private StoreRefregerator() {

    }

    public static StoreRefregerator getInstance() {
        return instance;
    }

    public void fill(int rose, int chamomile) {
        Deque<GeneralFlower> roseDeque = new LinkedList<>();
        Deque<GeneralFlower> chamomileDeque = new LinkedList<>();

        for (int i = 0; i < rose; i++) {
            FreshnessInteger fr = new FreshnessInteger(1);
            Rose r = new Rose(true, 20, 10, fr);
            roseDeque.add(r);
        }

        for (int i = 0; i < chamomile; i++) {
            FreshnessInteger fr = new FreshnessInteger(1);
            Chamomile c = new Chamomile(7, 10, 5, fr);
            chamomileDeque.add(c);
        }

        store.put("rose", roseDeque);
        store.put("chamomile", chamomileDeque);

    }

    public Map<String, Deque<GeneralFlower>> getStore() {
        return store;
    }

}
