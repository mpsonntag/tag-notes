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

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype Class.
 * Parse list of Strings to a List of tagged entities.
 */
public final class ParseList {

    /**
     * Prototype method.
     * Static method parsing a list of strings to a list of {@link TaggedEntity}.
     * @param toParse List containing (#)...#) tagged headers and body text.
     * @return List of {@link TaggedEntity}.
     */
    public static List<TaggedEntity> parseStringList(final List<String> toParse) {

        final List<TaggedEntity> retList = new ArrayList<>();

        System.out.println(
                String.join("", "[DEBUG] List has a length of: ",
                        Integer.toString(toParse.size()), "\n")
        );

        // check whether we are in a proper tag block. if not ignore all body lines until a next
        // proper tag block starts.
        Boolean properTag = true;
        Integer currLineNr = 0;

        for (String currLine : toParse) {
            currLineNr = currLineNr + 1;

            if (currLine.startsWith("(#)")) {

                if (!currLine.endsWith("#)")) {
                    System.out.println(String.join("", "[WARNING:", currLineNr.toString(),
                            "] Encountered incomplete Tag line at line ",
                            currLineNr.toString(), ". ",
                            "All lines until the next proper tag line will be ignored."));
                    properTag = false;
                } else {
                    properTag = true;
                    System.out.println(String.join("", "[DEBUG:", currLineNr.toString(), "] TagLine"));

                    retList.add(new TaggedEntity());

                    final String[] ls = currLine
                            .substring(currLine.indexOf("(#)") + "(#)".length(),
                                    currLine.length() - "#)".length())
                            .split(",");

                    for (String s : ls) {
                        retList.get(retList.size() - 1).getTags().add(s);
                    }
                }
            } else if (!retList.isEmpty() & properTag)  {
                System.out.println(String.join("", "[DEBUG:", currLineNr.toString(), "] BodyLine"));

                final String currString = retList.get(retList.size() - 1).getBody();
                retList.get(retList.size() - 1).setBody(
                        String.join("", currString, currLine, "\n")
                );
            } else {
                System.out.println(String.join("", "[WARNING:", currLineNr.toString(),
                        "] Found line not connected to a tag, will be omitted."));
            }
        }

        System.out.println(String.join("", "\n\n[DEBUG] # of Tagged entities: ",
                Integer.toString(retList.size()))
        );

        retList.forEach(c -> System.out.println(
                String.join("", "[DEBUG] ", "ID: ", c.getEntityID(), " Tags: ",
                        Integer.toString(c.getTags().size()), " ", c.getTags().toString(),
                        " Body: ", c.getBody()
                    )
                )
        );

        return retList;
    }

}
