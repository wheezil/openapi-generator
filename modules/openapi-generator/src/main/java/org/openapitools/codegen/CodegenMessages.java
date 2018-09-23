/*
 * Copyright (C) Redpoint Global Inc.  All rights reserved.
 */
package org.openapitools.codegen;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton that accumulates warnings and errors for later processing.
 * @author jlilley
 */
public class CodegenMessages {
    private static List<String> warnings = new ArrayList<>();
    private static List<String> errors = new ArrayList<>();
    
    public void clear() {
        warnings.clear();
        errors.clear();
    }
    
    public static /*synchronized*/ void warning(String msg) {
        warnings.add(msg);
    }

    public static /*synchronized*/ void error(String msg) {
        errors.add(msg);
    }

    public static List<String> getWarnings() {
        return warnings;
    }

    public static List<String> getErrors() {
        return errors;
    }
    
}
