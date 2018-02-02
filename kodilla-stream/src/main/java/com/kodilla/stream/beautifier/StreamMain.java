package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static jdk.nashorn.internal.objects.NativeString.trim;

public class StreamMain {
    public static void main(String[] args){
        PoemBeutifier poemBeutifier = new PoemBeutifier();

        poemBeutifier.beutify("Text to beautify",(a) ->"ABC"+a+"ABC" );
        poemBeutifier.beutify("Text to uppercase",(a) -> toUpperCase(a) );
        poemBeutifier.beutify("TexT to LOWERCASE",(a) -> toLowerCase(a) );
        poemBeutifier.beutify("  Text to trim   ",(a) -> trim(a) );
    }
}
