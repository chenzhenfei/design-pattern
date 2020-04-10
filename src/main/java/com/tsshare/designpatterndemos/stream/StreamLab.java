package com.tsshare.designpatterndemos.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author zfc
 * @title: TestCollect
 * @projectName design-pattern-demos
 * @description: 测试java 8 stream.collect
 * @date 2020/4/1022:43
 */
public class StreamLab {
    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i + "");
        }
        for (int i = 0; i < 10; i++) {
            c.add(i + "");
        }
//        testCollect(c);
//        testConcat(c);
//        testDistinct(c);
//        testFilter(c);
//        testFindFirst(c);
//        testSorted(c);
        testToArray(c);
        List<List<String>> d = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<String> t = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                t.add(j + "");
            }
            d.add(t);
        }
//        testFlatMap(d);
//        testFlatMapToDouble(d);
//          testOf();
//        testReduce();
//        testSkip();

    }

    public static void testCollect(List<String> param) {
        ArrayList<Object> collect = param.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        collect.forEach(n -> {
            System.out.println(n);
        });
        String s = param.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(s);
        String collect1 = param.stream().collect(String::new, String::concat, String::concat);
        System.out.println(collect1);
    }

    public static void testCollect2(List<String> param) {
        List<String> collect = param.stream().collect(Collectors.toList());
    }

    /**
     * 流元素进行链接
     *
     * @param param
     */
    public static void testConcat(List<String> param) {
        Stream<String> concat = Stream.concat(param.stream(), param.stream());
        concat.forEach(n -> {
            System.out.println(n);
        });
    }

    /**
     * @param param
     */
    public static void testDistinct(List<String> param) {
        Stream<String> distinct = param.stream().distinct();
        distinct.forEach(n -> {
            System.out.println(n);
        });
    }

    public static void testEmpty(List<String> param) {
        Stream<Object> empty = Stream.empty();
    }

    public static void testFilter(List<String> param) {
        Stream<String> stringStream = param.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("0");
            }
        });
        stringStream.forEach(n -> {
            System.out.println(n);
        });
    }

    public static void testFindAny(List<String> param) {
        Optional<String> any = param.stream().findAny();

    }

    public static void testFindFirst(List<String> param) {
        Optional<String> any = param.stream().findFirst();
        boolean present = any.isPresent();
        System.out.println(present);

    }

    public static void testFlatMap(List<List<String>> param) {
        Stream<String> stringStream = param.stream().flatMap(a -> {
            return a.stream();
        });
        stringStream.forEach(n -> System.out.println(n));
    }

    public static void testFlatMapToDouble(List<List<String>> param) {
        DoubleStream doubleStream = param.stream().flatMapToDouble(a -> {
            return a.stream().mapToDouble(Double::new);
        });
        doubleStream.forEach(n -> System.out.println(n));
    }

    public static void testMap(List<List<String>> param) {
        Stream<Stream<String>> streamStream = param.stream().map((n) -> {
            Stream<String> stream = n.stream();
            return stream;
        });
    }

    public static void testOf() {
        Stream<Long> longStream = Stream.of(1L, 2L, 5L, 4L, 3L);
        longStream.forEach(System.out::println);
    }

    public static void testReduce() {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
//        stream.reduce((i, j) -> i + j).ifPresent(System.out::println);
//        Integer reduce = stream.reduce(1, Integer::sum);

        //求最大值
//        stream.reduce(Integer::max).ifPresent(System.out::println);
//
//        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
//        //求最小值
//        stream.reduce(Integer::min).ifPresent(System.out::println);
//
//        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        //做逻辑
        stream.reduce((i, j) -> i > j ? j : i).ifPresent(System.out::println);

    }

    /**
     * 跳过流的第几个元素后剩余的元素流
     */
    public static void testSkip() {
        Stream<Long> longStream = Stream.of(1L, 2L, 5L, 4L, 3L);
        Stream<Long> skip = longStream.skip(3L);
        skip.forEach(System.out::println);
    }

    /**
     * 通过流的方式对元素进行比较排序
     *
     * @param param
     */
    public static void testSorted(List<String> param) {
        Stream<String> sorted = param.stream().sorted(String::compareTo);
        sorted.forEach(System.out::println);
    }

    public static void testToArray(List<String> param) {
        Object[] objects = param.stream().toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }


}
