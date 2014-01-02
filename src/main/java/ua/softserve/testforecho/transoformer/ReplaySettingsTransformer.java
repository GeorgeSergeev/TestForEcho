package ua.softserve.testforecho.transoformer;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.transformer.AbstractTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.softserve.testforecho.model.EchoSettingsModel;

public class ReplaySettingsTransformer extends AbstractTransformer {
	    @Override
	    protected Object doTransform(Object src, String enc) {
	    		EchoSettingsModel echoService = muleContext.getRegistry().lookupObject("echoService");
	    		return echoService;
	    }
	    
}
