/**
 * Copyright (c) 2016, Michael Sonntag
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted under the terms of the BSD License. See
 * LICENSE file in the root of the Project.
 */

package org.mps

import org.mps.lib.HandleFiles
import org.mps.lib.ParseList

/**
 * Read in provided text file, parse syntax and add to provided RDF file.
 */
fun main(args: Array<String>) {

    val getFileStr = HandleFiles().openTextFile()
    val getEntityList = ParseList.parseStringList(getFileStr)

}
