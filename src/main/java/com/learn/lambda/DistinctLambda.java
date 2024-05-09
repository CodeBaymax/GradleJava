package com.learn.lambda;

import com.learn.entity.CapSplit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctLambda {
    public static void main(String[] args) {
        List<CapSplit> splitList = new ArrayList<>();

        splitList.add(new CapSplit("1", "IM"));
        splitList.add(new CapSplit("1", "IM"));
        CapSplit capSplit = new CapSplit("2", "IM");
        splitList.add(capSplit);
        splitList.add(capSplit);

        System.out.println("============= " + splitList.size() + " =====================");

        List<CapSplit> list = splitList.stream().distinct().collect(Collectors.toList());
        System.out.println("============= " + list.size() + " =====================");
    }


    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return object -> seen.putIfAbsent(keyExtractor.apply(object), Boolean.TRUE) == null;
    }
}
