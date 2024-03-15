package org.fusesource.restygwt.rebind;

import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;

public class EncoderDecoderLocatorFactory {

    public static EncoderDecoderLocator getEncoderDecoderInstanceLocator(GeneratorContext context, TreeLogger logger)
        throws UnableToCompleteException {
        return restyGwtInstance(context, logger);
    }

    private static EncoderDecoderLocator restyGwtInstance(GeneratorContext context, TreeLogger logger)
        throws UnableToCompleteException {
        return new JsonEncoderDecoderInstanceLocator(context, logger);
    }

}
