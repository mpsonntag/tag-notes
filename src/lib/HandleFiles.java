/**
 * Copyright (c) 2016, Michael Sonntag
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted under the terms of the BSD License. See
 * LICENSE file in the root of the Project.
 */

package lib;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Read and write files.
 */
public class HandleFiles {

    public String openText() {

        final String fileName = "parse.txt";
        final String getFilePath = Paths.get(Paths.get("").toAbsolutePath().toString(), "src", "resources", fileName).toString();

        final File currTxtFile = new File(getFilePath);

        try (Stream<String> stream = Files.lines(Paths.get(getFilePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return getFilePath;
    }

}
