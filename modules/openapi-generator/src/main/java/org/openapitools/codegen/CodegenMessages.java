/*
 * Copyright (C) Redpoint Global Inc.  All rights reserved.
 */
package org.openapitools.codegen;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Singleton that accumulates warnings and errors for later processing.
 * @author jlilley
 */
public class CodegenMessages {
    private static List<String> warnings = new ArrayList<>();
    private static List<String> errors = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(CodegenMessages.class);
    
    public void clear() {
        warnings.clear();
        errors.clear();
    }
    
    public static void warning(String msg) {
        warnings.add(msg);
    }

    public static void error(String msg) {
		LOGGER.error(msg);	// in case something bad hapens as a result.
        errors.add(msg);
    }

    public static List<String> getWarnings() {
        return warnings;
    }

    public static List<String> getErrors() {
        return errors;
    }
    
}
