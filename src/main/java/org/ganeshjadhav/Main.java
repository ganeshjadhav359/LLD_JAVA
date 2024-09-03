package org.ganeshjadhav;

import org.ganeshjadhav.immutability.Address;
import org.ganeshjadhav.immutability.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(1, "ganesh", List.of(new Address("temp", "pune", 411412)));
    }
}