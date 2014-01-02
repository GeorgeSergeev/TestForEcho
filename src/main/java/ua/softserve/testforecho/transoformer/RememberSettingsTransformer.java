package ua.softserve.testforecho.transoformer;
//test2
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.transformer.AbstractTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.softserve.testforecho.model.EchoSettingsModel;
//It is test transformer 
public class RememberSettingsTransformer extends AbstractTransformer {
	    @Override
	    protected Object doTransform(Object src, String enc) {
	    	if (src instanceof EchoSettingsModel) {
	    		EchoSettingsModel echoSettingsModel= (EchoSettingsModel) src;
	    		EchoSettingsModel echoService = muleContext.getRegistry().lookupObject("echoService");
	    		echoService.setMessage(echoSettingsModel.getMessage());
	    		echoService.setStatusCode(echoSettingsModel.getStatusCode());
	    	}
	        return src;
	    }
	    
}
