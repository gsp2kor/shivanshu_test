package com.shivanshu.practice;

import java.util.*;

public class KClosestPointsToOrigin {

    private static int[][] kClosest(int[][] points, int K) {
        Map<Integer, List<Integer>> listOfIntegers = new HashMap<>();
        int[][] result = new int[K][2];


        for (int[] point : points) {
            int mul = point[0] * point[0] + point[1] * point[1];
            if (listOfIntegers.get(mul) != null) {
                listOfIntegers.get(mul).add(point[0]);
                listOfIntegers.get(mul).add(point[1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(point[0]);
                list.add(point[1]);
                listOfIntegers.put(mul, list);
            }
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>(listOfIntegers);
        List<Integer> finalList = new ArrayList<>();
        map.values().forEach(finalList::addAll);


        for(int i = 0 ; i < K ;i++){
            result[i][0] = finalList.remove(0);
            result[i][1] = finalList.remove(0);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2)));
    }
}
