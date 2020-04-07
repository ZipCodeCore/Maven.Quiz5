package rocks.zipcode.io.quiz4.generics;

import com.google.common.collect.Collections2;


import java.util.*;

import com.google.common.collect.Sets;

/**
 * @author leon on 11/12/2018.
 */




public class GenericUtils{
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
//        if (originalSet.isEmpty()) {
//            Set<Set<T>> ret = new LinkedHashSet<>();
//
//            ret.add(originalSet);
//            return ret;
//        }
//
//        T element = originalSet.iterator().next();
//        Set<T> subSetWithoutElement = getSubSetWithoutElement(originalSet, element);
//        Set<Set<T>> powerSetSubSetWithoutElement = (Set<Set<T>>) powerSet(subSetWithoutElement);
//        Set<Set<T>> powerSetSubSetWithElement = addElementToAll(powerSetSubSetWithoutElement, element);
//
//        Set<Set<T>> powerSet = new LinkedHashSet<>();
//
//        powerSet.addAll(powerSetSubSetWithoutElement);
//        powerSet.addAll(powerSetSubSetWithElement);
//
//        return powerSet;


        Iterator<Set<T>> power = Sets.powerSet(originalSet).iterator();
        ArrayList<List<T>> powerToList = new ArrayList<>();
        power.forEachRemaining(set -> powerToList.add((new ArrayList<>(set))));
        //[[], [x], [y], [x, y], [z], [x,z], [y,z], [x, y, z]]
        Set<List<T>> result = new LinkedHashSet<>();
        powerToList.iterator().forEachRemaining(list -> result.addAll(Collections2.permutations(list)));
        //[[], [x], [y], [x, y], [y, x], [z], [x, z], [z, x], [y, z], [z, y], [x, y, z], [x, z, y], [z, x, y], [z, y, x], [y, z, x], [y, x, z]]
        Collection<List<T>> unwantedPerms = removeOriginalSet(originalSet);
        result.removeAll(unwantedPerms);
        //[[], [x], [y], [x, y], [y, x], [z], [x, z], [z, x], [y, z], [z, y], [x, y, z]]
        ArrayList<List<T>> resultList = new ArrayList<>(result);
        resultList.sort(new EmmaListComp());
        //[[x, y, z], [x,y], [x,z], [x], [y, x], [y, z], [y], [z, x], [z, y], [z], []]
        return resultList;
    }

    private static <T extends Comparable<T>> Collection<List<T>> removeOriginalSet(Set<T> originalSet) {
        ArrayList<List<T>> permsOnOriginal = new ArrayList<>(Collections2.permutations(originalSet));
        //[[x, y, z], [x, z, y], [z, x, y], [z, y, x], [y, z, x], [y, x, z]]
        permsOnOriginal.remove(new ArrayList<>(originalSet));
        //[[x, z, y], [z, x, y], [z, y, x], [y, z, x], [y, x, z]]
        return permsOnOriginal;
    }


    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }

//    public static void main(String[] args) {
//        String[] input = {"x", "y", "z"};
//        //[[x, y, z], [x, y], [x, z], [x], [y, x], [y, z],
//        // [y], [z, x], [z, y], [z], []]
//        powerSet(input);
//    }

}

