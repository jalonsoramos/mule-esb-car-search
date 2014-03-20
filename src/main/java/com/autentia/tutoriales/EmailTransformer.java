package com.autentia.tutoriales;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transport.email.MailProperties;

public class EmailTransformer extends AbstractMessageTransformer {
	

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        final Car car = (Car) message.getPayload();

        final StringBuilder mailMessage =  new StringBuilder("A continuaci—n le enviamos los datos del vehiculo que nos ha solicitado:").append("\n");
        mailMessage.append("Fabricante:  " + car.getManufacturer()).append("\n");
        mailMessage.append("Modelo: " + car.getModel()).append("\n");
        mailMessage.append("Precio: " + car.getPrice()).append(" euros \n");
        mailMessage.append("Recibe un cordial saludo. ");
        
        message.setOutboundProperty(MailProperties.SUBJECT_PROPERTY, "Informaci—n del veh’culo que nos ha solicitado");
        message.setOutboundProperty(MailProperties.TO_ADDRESSES_PROPERTY, car.getCustomerMail());

        return mailMessage.toString();
    }
}
