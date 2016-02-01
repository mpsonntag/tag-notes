/**
 * Copyright (c) 2016, Michael Sonntag
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted under the terms of the BSD License. See
 * LICENSE file in the root of the Project.
 */

package org.mps.lib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Prototype class.
 * Read and write files.
 */
public class HandleFiles {

    /**
     * Prototype method.
     * Opening a text file from resources and return the content as a list of Strings.
     * @return List of strings, each list entry corresponds to a line from the text file.
     */
    public final List<String> openTextFile() {

        final String fileName = "parse.txt";
        final String getFilePath = Paths.get(
                Paths.get("").toAbsolutePath().toString(), "src", "main/resources", fileName).toString();

        // Probably not the wisest thing to do to create a list from a text file.
        // But for getting the thing on the road it should be ok for now.
        List<String> retList = new ArrayList<>();

        try {
            final Stream<String> stream = Files.lines(Paths.get(getFilePath));
            retList = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return retList;
    }

}
